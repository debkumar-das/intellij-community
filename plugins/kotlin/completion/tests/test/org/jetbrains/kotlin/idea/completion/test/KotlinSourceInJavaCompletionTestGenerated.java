/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.completion.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-completion/testData/injava")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinSourceInJavaCompletionTestGenerated extends AbstractKotlinSourceInJavaCompletionTest {
    public void testAllFilesPresentInInjava() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/injava"), Pattern.compile("^(.+)\\.java$"), true);
    }

    @TestMetadata("AnnotationParameter.java")
    public void testAnnotationParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/AnnotationParameter.java");
        doTest(fileName);
    }

    @TestMetadata("Class.java")
    public void testClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/Class.java");
        doTest(fileName);
    }

    @TestMetadata("ClassMembers.java")
    public void testClassMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/ClassMembers.java");
        doTest(fileName);
    }

    @TestMetadata("ClassObject.java")
    public void testClassObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/ClassObject.java");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectField.java")
    public void testClassObjectField() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/ClassObjectField.java");
        doTest(fileName);
    }

    @TestMetadata("ClassesFromNamespace.java")
    public void testClassesFromNamespace() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/ClassesFromNamespace.java");
        doTest(fileName);
    }

    @TestMetadata("EnumConstants.java")
    public void testEnumConstants() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/EnumConstants.java");
        doTest(fileName);
    }

    @TestMetadata("InterfaceDefaultImpl.java")
    public void testInterfaceDefaultImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/InterfaceDefaultImpl.java");
        doTest(fileName);
    }

    @TestMetadata("InterfaceDefaultImplImportedMembers.java")
    public void testInterfaceDefaultImplImportedMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/InterfaceDefaultImplImportedMembers.java");
        doTest(fileName);
    }

    @TestMetadata("InterfaceDefaultImplMembers.java")
    public void testInterfaceDefaultImplMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/InterfaceDefaultImplMembers.java");
        doTest(fileName);
    }

    @TestMetadata("InterfaceDefaultImplStaticImportedMembers.java")
    public void testInterfaceDefaultImplStaticImportedMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/InterfaceDefaultImplStaticImportedMembers.java");
        doTest(fileName);
    }

    @TestMetadata("InterfaceDefaultImplsNonImported.java")
    public void testInterfaceDefaultImplsNonImported() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/InterfaceDefaultImplsNonImported.java");
        doTest(fileName);
    }

    @TestMetadata("MultiFileFacade.java")
    public void testMultiFileFacade() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/MultiFileFacade.java");
        doTest(fileName);
    }

    @TestMetadata("MultiFileFacadeMembers.java")
    public void testMultiFileFacadeMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/MultiFileFacadeMembers.java");
        doTest(fileName);
    }

    @TestMetadata("MultiFileFacadeNoImport.java")
    public void testMultiFileFacadeNoImport() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/MultiFileFacadeNoImport.java");
        doTest(fileName);
    }

    @TestMetadata("Nested.java")
    public void testNested() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/Nested.java");
        doTest(fileName);
    }

    @TestMetadata("NestedClassMembers.java")
    public void testNestedClassMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/NestedClassMembers.java");
        doTest(fileName);
    }

    @TestMetadata("NestedClassMembers2.java")
    public void testNestedClassMembers2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/NestedClassMembers2.java");
        doTest(fileName);
    }

    @TestMetadata("NestedNoImport.java")
    public void testNestedNoImport() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/NestedNoImport.java");
        doTest(fileName);
    }

    @TestMetadata("NestedObjectInstance.java")
    public void testNestedObjectInstance() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/NestedObjectInstance.java");
        doTest(fileName);
    }

    @TestMetadata("ObjectInClassObjects.java")
    public void testObjectInClassObjects() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/ObjectInClassObjects.java");
        doTest(fileName);
    }

    @TestMetadata("ObjectInstance.java")
    public void testObjectInstance() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/ObjectInstance.java");
        doTest(fileName);
    }

    @TestMetadata("RenamedFacade.java")
    public void testRenamedFacade() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/RenamedFacade.java");
        doTest(fileName);
    }

    @TestMetadata("SingleFileFacade.java")
    public void testSingleFileFacade() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/SingleFileFacade.java");
        doTest(fileName);
    }

    @TestMetadata("SingleFileFacadeMembers.java")
    public void testSingleFileFacadeMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/SingleFileFacadeMembers.java");
        doTest(fileName);
    }

    @TestMetadata("SingleFileFacadeNoImport.java")
    public void testSingleFileFacadeNoImport() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/SingleFileFacadeNoImport.java");
        doTest(fileName);
    }

    @TestMetadata("Subpackage.java")
    public void testSubpackage() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/Subpackage.java");
        doTest(fileName);
    }

    @TestMetadata("TopLevelMembers.java")
    public void testTopLevelMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/TopLevelMembers.java");
        doTest(fileName);
    }

    @TestMetadata("TraitMember.java")
    public void testTraitMember() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/TraitMember.java");
        doTest(fileName);
    }

}
