/*
 * Copyright 2010-2012 JetBrains s.r.o.
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
package org.jetbrains.jet.codegen.generated;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.codegen.generated.AbstractCodegenTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@TestMetadata("compiler/testData/codegen/innerNested")
public class InnerNestedGenTestGenerated extends AbstractCodegenTest {
    public void testAllFilesPresentInInnerNested() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/innerNested"), "kt", true);
    }
    
    @TestMetadata("createNestedClass.kt")
    public void testCreateNestedClass() throws Exception {
        doTest("compiler/testData/codegen/innerNested/createNestedClass.kt");
    }
    
    @TestMetadata("createdNestedInOuterMember.kt")
    public void testCreatedNestedInOuterMember() throws Exception {
        doTest("compiler/testData/codegen/innerNested/createdNestedInOuterMember.kt");
    }
    
    @TestMetadata("dataLocalVariable.kt")
    public void testDataLocalVariable() throws Exception {
        doTest("compiler/testData/codegen/innerNested/dataLocalVariable.kt");
    }
    
    @TestMetadata("extensionFun.kt")
    public void testExtensionFun() throws Exception {
        doTest("compiler/testData/codegen/innerNested/extensionFun.kt");
    }
    
    @TestMetadata("importNestedClass.kt")
    public void testImportNestedClass() throws Exception {
        doTest("compiler/testData/codegen/innerNested/importNestedClass.kt");
    }
    
    @TestMetadata("innerGeneric.kt")
    public void testInnerGeneric() throws Exception {
        doTest("compiler/testData/codegen/innerNested/innerGeneric.kt");
    }
    
    @TestMetadata("innerLabeledThis.kt")
    public void testInnerLabeledThis() throws Exception {
        doTest("compiler/testData/codegen/innerNested/innerLabeledThis.kt");
    }
    
    @TestMetadata("innerSimple.kt")
    public void testInnerSimple() throws Exception {
        doTest("compiler/testData/codegen/innerNested/innerSimple.kt");
    }
    
    @TestMetadata("nestedClassObject.kt")
    public void testNestedClassObject() throws Exception {
        doTest("compiler/testData/codegen/innerNested/nestedClassObject.kt");
    }
    
    @TestMetadata("nestedEnumConstant.kt")
    public void testNestedEnumConstant() throws Exception {
        doTest("compiler/testData/codegen/innerNested/nestedEnumConstant.kt");
    }
    
    @TestMetadata("nestedGeneric.kt")
    public void testNestedGeneric() throws Exception {
        doTest("compiler/testData/codegen/innerNested/nestedGeneric.kt");
    }
    
    @TestMetadata("nestedInPackage.kt")
    public void testNestedInPackage() throws Exception {
        doTest("compiler/testData/codegen/innerNested/nestedInPackage.kt");
    }
    
    @TestMetadata("nestedObjects.kt")
    public void testNestedObjects() throws Exception {
        doTest("compiler/testData/codegen/innerNested/nestedObjects.kt");
    }
    
    @TestMetadata("nestedSimple.kt")
    public void testNestedSimple() throws Exception {
        doTest("compiler/testData/codegen/innerNested/nestedSimple.kt");
    }
    
}
