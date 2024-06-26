/*
 * Copyright 2000-2014 JetBrains s.r.o.
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
package com.intellij.testFramework;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Should be implemented by a test together with annotation @RunWith(com.intellij.testFramework.Parameterized.class)
 * in order to get test run on all test data files located in directory. The desired directory could be configured 
 * whether by implementing {@link FileBasedTestCaseHelperEx#getRelativeBasePath()} or by annotating test case 
 * with {@link TestDataPath} (annotation would enable additional test assistance support, e.g. 
 * navigation from test data to test class/method as well as starting tests right from test data files). 
 * <br/><br/>
 * BTW @RunWith works also on abstract super classes.
 * @see LightPlatformCodeInsightTestCase#params(Class)
 */
public interface FileBasedTestCaseHelper {
  /**
   * @return for 'before' files should return core file name or null otherwise
   */
  @Nullable
  String getFileSuffix(@NotNull String fileName);

  /**
   * @return for 'after' files should return core file name or null otherwise
   */
  @Nullable
  default String getBaseName(@NotNull String fileAfterSuffix) {
    return null;
  }
}
