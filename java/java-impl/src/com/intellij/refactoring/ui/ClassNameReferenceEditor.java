// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.refactoring.ui;

import com.intellij.ide.util.ClassFilter;
import com.intellij.ide.util.TreeClassChooser;
import com.intellij.ide.util.TreeClassChooserFactory;
import com.intellij.java.JavaBundle;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.psi.*;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.ui.ReferenceEditorWithBrowseButton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClassNameReferenceEditor extends ReferenceEditorWithBrowseButton {
  public static final Key<Boolean> CLASS_NAME_REFERENCE_FRAGMENT = Key.create("CLASS_NAME_REFERENCE_FRAGMENT");
  private final Project myProject;
  private PsiClass mySelectedClass;
  private @NlsContexts.DialogTitle String myChooserTitle;

  public ClassNameReferenceEditor(final @NotNull Project project, final @Nullable PsiClass selectedClass) {
    this(project, selectedClass, null);
  }

  public ClassNameReferenceEditor(final @NotNull Project project, final @Nullable PsiClass selectedClass,
                                  final @Nullable GlobalSearchScope resolveScope) {
    super(null, project, s -> {
      PsiPackage defaultPackage = JavaPsiFacade.getInstance(project).findPackage("");
      final JavaCodeFragment fragment = JavaCodeFragmentFactory.getInstance(project).createReferenceCodeFragment(s, defaultPackage, true, true);
      fragment.setVisibilityChecker(JavaCodeFragment.VisibilityChecker.EVERYTHING_VISIBLE);
      if (resolveScope != null) {
        fragment.forceResolveScope(resolveScope);
      }
      fragment.putUserData(CLASS_NAME_REFERENCE_FRAGMENT, true);
      return PsiDocumentManager.getInstance(project).getDocument(fragment);
    }, selectedClass != null ? selectedClass.getQualifiedName() : "");

    myProject = project;
    myChooserTitle = JavaBundle.message("class.filter.editor.choose.class.title");
    addActionListener(new ChooseClassAction());
  }

  public String getChooserTitle() {
    return myChooserTitle;
  }

  public void setChooserTitle(final @NlsContexts.DialogTitle String chooserTitle) {
    myChooserTitle = chooserTitle;
  }

  private class ChooseClassAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      TreeClassChooser chooser = TreeClassChooserFactory.getInstance(myProject).createWithInnerClassesScopeChooser(myChooserTitle,
                                                                                                                   GlobalSearchScope.projectScope(myProject),
                                                                                                                   new ClassFilter() {
        @Override
        public boolean isAccepted(PsiClass aClass) {
          return aClass.getParent() instanceof PsiJavaFile || aClass.hasModifierProperty(PsiModifier.STATIC);
        }
      }, null);
      if (mySelectedClass != null) {
        chooser.selectDirectory(mySelectedClass.getContainingFile().getContainingDirectory());
      }
      chooser.showDialog();
      mySelectedClass = chooser.getSelected();
      if (mySelectedClass != null) {
        setText(mySelectedClass.getQualifiedName());
      }
    }
  }
}