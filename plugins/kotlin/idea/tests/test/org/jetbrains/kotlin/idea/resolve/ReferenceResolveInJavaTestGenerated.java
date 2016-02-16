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

package org.jetbrains.kotlin.idea.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/resolve/referenceInJava")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ReferenceResolveInJavaTestGenerated extends AbstractReferenceResolveInJavaTest {
    public void testAllFilesPresentInReferenceInJava() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/resolve/referenceInJava"), Pattern.compile("^(.+)\\.java$"), true);
    }

    @TestMetadata("AnnotationParameterReference.java")
    public void testAnnotationParameterReference() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/AnnotationParameterReference.java");
        doTest(fileName);
    }

    @TestMetadata("AutoGeneratedOverloads.java")
    public void testAutoGeneratedOverloads() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/AutoGeneratedOverloads.java");
        doTest(fileName);
    }

    @TestMetadata("Class.java")
    public void testClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/Class.java");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectField.java")
    public void testClassObjectField() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/ClassObjectField.java");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectStaticField.java")
    public void testClassObjectStaticField() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/ClassObjectStaticField.java");
        doTest(fileName);
    }

    @TestMetadata("Constructor.java")
    public void testConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/Constructor.java");
        doTest(fileName);
    }

    @TestMetadata("DelegatedMethodFromTraitNoImpl.java")
    public void testDelegatedMethodFromTraitNoImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/DelegatedMethodFromTraitNoImpl.java");
        doTest(fileName);
    }

    @TestMetadata("DelegatedMethodFromTraitWithImpl.java")
    public void testDelegatedMethodFromTraitWithImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/DelegatedMethodFromTraitWithImpl.java");
        doTest(fileName);
    }

    @TestMetadata("EnumEntry.java")
    public void testEnumEntry() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/EnumEntry.java");
        doTest(fileName);
    }

    @TestMetadata("FileFacade.java")
    public void testFileFacade() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/FileFacade.java");
        doTest(fileName);
    }

    @TestMetadata("Getter.java")
    public void testGetter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/Getter.java");
        doTest(fileName);
    }

    @TestMetadata("Method.java")
    public void testMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/Method.java");
        doTest(fileName);
    }

    @TestMetadata("ObjectInstance.java")
    public void testObjectInstance() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/ObjectInstance.java");
        doTest(fileName);
    }

    @TestMetadata("PlatformStaticFun.java")
    public void testPlatformStaticFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/resolve/referenceInJava/PlatformStaticFun.java");
        doTest(fileName);
    }
}
