/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("yes");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "no" + "'", str1, "no");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.lang3.PasswordGenerator passwordGenerator0 = new org.apache.commons.lang3.PasswordGenerator();
        java.lang.Class<?> wildcardClass1 = passwordGenerator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("no");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gSjIZjlixA" + "'", str4, "gSjIZjlixA");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}*ZbNO81xQ" + "'", str4, "}*ZbNO81xQ");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("}*ZbNO81xQ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, false, true, true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("gSjIZjlixA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "voopnHROUd" + "'", str4, "voopnHROUd");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, false, true, true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5734805896788488398589412866751387446985637466274759202301828508503158673586598617298731036972230" + "'", str4, "5734805896788488398589412866751387446985637466274759202301828508503158673586598617298731036972230");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "^.B<k4q%2Scp$B]mCyjj%AX29wdk5lct+)." + "'", str4, "^.B<k4q%2Scp$B]mCyjj%AX29wdk5lct+).");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("^.B<k4q%2Scp$B]mCyjj%AX29wdk5lct+).");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, true, false, true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("voopnHROUd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Fjd3FJJTBDdNT1nqAIk8TL3hO1aWspq7E2QOGztt1W4z8IcX84Gr" + "'", str4, "Fjd3FJJTBDdNT1nqAIk8TL3hO1aWspq7E2QOGztt1W4z8IcX84Gr");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MGJ7sJkGz8VRgVNufBiwZm4Xq6skGw9KBJI" + "'", str4, "MGJ7sJkGz8VRgVNufBiwZm4Xq6skGw9KBJI");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7161560304531673003051680159797824478059420705635989" + "'", str4, "7161560304531673003051680159797824478059420705635989");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "269?%[0^:,,<>31877[@?35>;1__7#{(" + "'", str4, "269?%[0^:,,<>31877[@?35>;1__7#{(");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5156872517592390915514971598147460026392806427182054703305584491504300137689014227038012580424778639" + "'", str4, "5156872517592390915514971598147460026392806427182054703305584491504300137689014227038012580424778639");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("5734805896788488398589412866751387446985637466274759202301828508503158673586598617298731036972230");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "wlwsSkIahdZgbcCkx28houBiS60hTOaz3G1MuqSFiTAhRziS9vVi2wid66R7moPE6l1G4ineyQB3YuREcoNYCVq8UUTi9phKtenn" + "'", str4, "wlwsSkIahdZgbcCkx28houBiS60hTOaz3G1MuqSFiTAhRziS9vVi2wid66R7moPE6l1G4ineyQB3YuREcoNYCVq8UUTi9phKtenn");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1508296663119492620444337975543099629920648171236130682550873398602246686021869831539201077732152651" + "'", str4, "1508296663119492620444337975543099629920648171236130682550873398602246686021869831539201077732152651");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-$23wc]QjN" + "'", str4, "-$23wc]QjN");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("MGJ7sJkGz8VRgVNufBiwZm4Xq6skGw9KBJI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "&*<+@${_&+" + "'", str4, "&*<+@${_&+");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("&*<+@${_&+");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "N34n]}RNUoY.P#O;,ua:f1Fs#n2E2JI)Ge0>xbX9BQz6l9&q*F;J" + "'", str4, "N34n]}RNUoY.P#O;,ua:f1Fs#n2E2JI)Ge0>xbX9BQz6l9&q*F;J");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("269?%[0^:,,<>31877[@?35>;1__7#{(");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("-$23wc]QjN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("5156872517592390915514971598147460026392806427182054703305584491504300137689014227038012580424778639");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "f?&kk{v+|%&hc*DLrgoGqf|h]k:Ff(QF{l{[ZvWdH*^Ua!=}](VNWpo^Vdk[T=^GaYia*F#x|u-{@pPIp$ISNb]}PuvyB^+v&" + "'", str4, "f?&kk{v+|%&hc*DLrgoGqf|h]k:Ff(QF{l{[ZvWdH*^Ua!=}](VNWpo^Vdk[T=^GaYia*F#x|u-{@pPIp$ISNb]}PuvyB^+v&");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "84201882139620079492325091726446787" + "'", str4, "84201882139620079492325091726446787");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GhROsYgLlsJqxsxtBrujhhUBaxoHOEmEeTNNuwqZZKGavAhaEisP" + "'", str4, "GhROsYgLlsJqxsxtBrujhhUBaxoHOEmEeTNNuwqZZKGavAhaEisP");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("N34n]}RNUoY.P#O;,ua:f1Fs#n2E2JI)Ge0>xbX9BQz6l9&q*F;J");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GCfDnG3WtNGlbzM3Nsr5hmyvAWx4OXsvf77TVMsQ3WUF4MG7xbba7oBCjoxqRdhEklablVDQRpbZF34wtR5wNzhatSVp8NVqxHq8" + "'", str4, "GCfDnG3WtNGlbzM3Nsr5hmyvAWx4OXsvf77TVMsQ3WUF4MG7xbba7oBCjoxqRdhEklablVDQRpbZF34wtR5wNzhatSVp8NVqxHq8");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DcHYRhaekVuawHjlHtzzcHFyTjJqxGnmsjO" + "'", str4, "DcHYRhaekVuawHjlHtzzcHFyTjJqxGnmsjO");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("GCfDnG3WtNGlbzM3Nsr5hmyvAWx4OXsvf77TVMsQ3WUF4MG7xbba7oBCjoxqRdhEklablVDQRpbZF34wtR5wNzhatSVp8NVqxHq8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "})|C(Z}cd_8ijj-*f%P(I{6Neyn!:!;tR2n5Et2t2$kOOy+!ypGWs!!9-_cTz>v<BDuF#7SwR^Vm&|vyhos;XF0Bh7]d18{A+tc4" + "'", str4, "})|C(Z}cd_8ijj-*f%P(I{6Neyn!:!;tR2n5Et2t2$kOOy+!ypGWs!!9-_cTz>v<BDuF#7SwR^Vm&|vyhos;XF0Bh7]d18{A+tc4");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BfYQnn7rycu95xzubQm7vRjAWWYuNyTbCcudc5nGPWNxqPW2fSfa7N2nvfqYVrVyGFKewfUQhRYaoEktRLZWEquXcsMlEbWxYZb1" + "'", str4, "BfYQnn7rycu95xzubQm7vRjAWWYuNyTbCcudc5nGPWNxqPW2fSfa7N2nvfqYVrVyGFKewfUQhRYaoEktRLZWEquXcsMlEbWxYZb1");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("84201882139620079492325091726446787");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("1508296663119492620444337975543099629920648171236130682550873398602246686021869831539201077732152651");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jy;*Y.>:8Bbs+_:oji)(hbh3-gL^^Q5x" + "'", str4, "jy;*Y.>:8Bbs+_:oji)(hbh3-gL^^Q5x");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("BfYQnn7rycu95xzubQm7vRjAWWYuNyTbCcudc5nGPWNxqPW2fSfa7N2nvfqYVrVyGFKewfUQhRYaoEktRLZWEquXcsMlEbWxYZb1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("DcHYRhaekVuawHjlHtzzcHFyTjJqxGnmsjO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AXcaCoGciaLpwfdlsuwVgzQWlQlkYFdKZYuNvGEtDuBMkLdHWXgpBfsAlKDbwGHrHcizmcuzsXTQgUrSDLQMIRedYXvGRgbYdKTI" + "'", str4, "AXcaCoGciaLpwfdlsuwVgzQWlQlkYFdKZYuNvGEtDuBMkLdHWXgpBfsAlKDbwGHrHcizmcuzsXTQgUrSDLQMIRedYXvGRgbYdKTI");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("jy;*Y.>:8Bbs+_:oji)(hbh3-gL^^Q5x");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("7161560304531673003051680159797824478059420705635989");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', true, true, true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "876gCXglOe" + "'", str4, "876gCXglOe");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("AXcaCoGciaLpwfdlsuwVgzQWlQlkYFdKZYuNvGEtDuBMkLdHWXgpBfsAlKDbwGHrHcizmcuzsXTQgUrSDLQMIRedYXvGRgbYdKTI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ";<+>-|,&<+$___{%);,,);?!,{,##)%_=<]%$}!}^{-=#$:}}}-(^$^?[{#&+%:.^$|$(<!<?=#!,{=(-)|%_+_]@->[,{[-|" + "'", str4, ";<+>-|,&<+$___{%);,,);?!,{,##)%_=<]%$}!}^{-=#$:}}}-(^$^?[{#&+%:.^$|$(<!<?=#!,{=(-)|%_+_]@->[,{[-|");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "sRvKDtGItlPCiuchVHEPWebnIxRqmEPA" + "'", str4, "sRvKDtGItlPCiuchVHEPWebnIxRqmEPA");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("Fjd3FJJTBDdNT1nqAIk8TL3hO1aWspq7E2QOGztt1W4z8IcX84Gr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ")*=Ke|Pp[DzRc*T=<C|:i{ofKyeV|jo?nA+j[P._JoMD;RWFJ<}f@]xa=?QlQqtgDDEv-op:ua_S&y<:}}K.wTJ]}P]Zr[xrWcau" + "'", str4, ")*=Ke|Pp[DzRc*T=<C|:i{ofKyeV|jo?nA+j[P._JoMD;RWFJ<}f@]xa=?QlQqtgDDEv-op:ua_S&y<:}}K.wTJ]}P]Zr[xrWcau");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "&@*}&:^{&{^*.{^-+-##]!*;}|^,{^=?>-$.(?,.!!|;;**=>}<^!<.[$:*{^%#;^&)(?=>!],=*{($+#:>}|#=:$)*@,==(+&$^" + "'", str4, "&@*}&:^{&{^*.{^-+-##]!*;}|^,{^=?>-$.(?,.!!|;;**=>}<^!<.[$:*{^%#;^&)(?=>!],=*{($+#:>}|#=:$)*@,==(+&$^");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("})|C(Z}cd_8ijj-*f%P(I{6Neyn!:!;tR2n5Et2t2$kOOy+!ypGWs!!9-_cTz>v<BDuF#7SwR^Vm&|vyhos;XF0Bh7]d18{A+tc4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', true, false, true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("f?&kk{v+|%&hc*DLrgoGqf|h]k:Ff(QF{l{[ZvWdH*^Ua!=}](VNWpo^Vdk[T=^GaYia*F#x|u-{@pPIp$ISNb]}PuvyB^+v&");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PzAToNqgXpeaaoavItzXWmhCcQdQWXTwXoKJjyeUnykIcXvXoQsLQWGSXfcAyxQhBiwrHutslsjjWPwszBqlmfiUrrsyiCKZVvqC" + "'", str4, "PzAToNqgXpeaaoavItzXWmhCcQdQWXTwXoKJjyeUnykIcXvXoQsLQWGSXfcAyxQhBiwrHutslsjjWPwszBqlmfiUrrsyiCKZVvqC");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("GhROsYgLlsJqxsxtBrujhhUBaxoHOEmEeTNNuwqZZKGavAhaEisP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("wlwsSkIahdZgbcCkx28houBiS60hTOaz3G1MuqSFiTAhRziS9vVi2wid66R7moPE6l1G4ineyQB3YuREcoNYCVq8UUTi9phKtenn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ciN@NGZ(gWd?[hLrKK?ab>ToO@TLC]tdw*BaX*a@%mE{_)^|>vXBg+u?walMZb;]moMiaMla^fyB&i][*|Wutl:Pbs!us%DqrPtZ" + "'", str4, "ciN@NGZ(gWd?[hLrKK?ab>ToO@TLC]tdw*BaX*a@%mE{_)^|>vXBg+u?walMZb;]moMiaMla^fyB&i][*|Wutl:Pbs!us%DqrPtZ");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword(")*=Ke|Pp[DzRc*T=<C|:i{ofKyeV|jo?nA+j[P._JoMD;RWFJ<}f@]xa=?QlQqtgDDEv-op:ua_S&y<:}}K.wTJ]}P]Zr[xrWcau");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fyAvqOHTgL" + "'", str4, "fyAvqOHTgL");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ";9a{3k[dpJ" + "'", str4, ";9a{3k[dpJ");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2282786931" + "'", str4, "2282786931");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":%<<554#3}" + "'", str4, ":%<<554#3}");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("2282786931");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword(":%<<554#3}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword(";9a{3k[dpJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "z5mgq3t5C0" + "'", str4, "z5mgq3t5C0");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SE7TxfZlet" + "'", str4, "SE7TxfZlet");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("ciN@NGZ(gWd?[hLrKK?ab>ToO@TLC]tdw*BaX*a@%mE{_)^|>vXBg+u?walMZb;]moMiaMla^fyB&i][*|Wutl:Pbs!us%DqrPtZ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FpIiwyavNFOJtsITWJjvckUxOkZdbwXJFIazpbOqvVzTVchplcAbuSfEXnnUMLchgqfMnENnkmMVkxAlijGxopFQPvqGvMAvb" + "'", str4, "FpIiwyavNFOJtsITWJjvckUxOkZdbwXJFIazpbOqvVzTVchplcAbuSfEXnnUMLchgqfMnENnkmMVkxAlijGxopFQPvqGvMAvb");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("z5mgq3t5C0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("876gCXglOe");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("fyAvqOHTgL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{$?}0=.713" + "'", str4, "{$?}0=.713");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("FpIiwyavNFOJtsITWJjvckUxOkZdbwXJFIazpbOqvVzTVchplcAbuSfEXnnUMLchgqfMnENnkmMVkxAlijGxopFQPvqGvMAvb");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("&@*}&:^{&{^*.{^-+-##]!*;}|^,{^=?>-$.(?,.!!|;;**=>}<^!<.[$:*{^%#;^&)(?=>!],=*{($+#:>}|#=:$)*@,==(+&$^");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("sRvKDtGItlPCiuchVHEPWebnIxRqmEPA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "^&<:%<$*>+!);>.&=]-&@:<)[[#@>{?:" + "'", str4, "^&<:%<$*>+!);>.&=]-&@:<)[[#@>{?:");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("PzAToNqgXpeaaoavItzXWmhCcQdQWXTwXoKJjyeUnykIcXvXoQsLQWGSXfcAyxQhBiwrHutslsjjWPwszBqlmfiUrrsyiCKZVvqC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*}++]#[)[@(=;_}{[]%&&&#)>%(+[!)-,?(@,}%:({{-{;[}^*{!" + "'", str4, "*}++]#[)[@(=;_}{[]%&&&#)>%(+[!)-,?(@,}%:({{-{;[}^*{!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "oq9u84COolrsc0Z3qLGgUVVr8J5Olahn" + "'", str4, "oq9u84COolrsc0Z3qLGgUVVr8J5Olahn");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{>_|>133].$[-&1-&}{;{)688{&6(>%9(++1:0{0_44=8%?|%][0+16>++40000>{-.5{_=65>59)^7$)*.*3!@{.7?0@[*(+" + "'", str4, "{>_|>133].$[-&1-&}{;{)688{&6(>%9(++1:0{0_44=8%?|%][0+16>++40000>{-.5{_=65>59)^7$)*.*3!@{.7?0@[*(+");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("^&<:%<$*>+!);>.&=]-&@:<)[[#@>{?:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0521962810" + "'", str4, "0521962810");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("SE7TxfZlet");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]{^}$)}{^." + "'", str4, "]{^}$)}{^.");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2%8:4]<92%1^1]^69:4^.]?>&>1*!829&30:$8[#+}}49$7]+449(>>558@:3:5^+5|)0}4$%}?*0.<>!:[.?*_:%9$<7;.1)30+" + "'", str4, "2%8:4]<92%1^1]^69:4^.]?>&>1*!829&30:$8[#+}}49$7]+449(>>558@:3:5^+5|)0}4$%}?*0.<>!:[.?*_:%9$<7;.1)30+");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("*}++]#[)[@(=;_}{[]%&&&#)>%(+[!)-,?(@,}%:({{-{;[}^*{!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "?**|};}},%<.!{.|]]]%()*_*^*!!>-],^=" + "'", str4, "?**|};}},%<.!{.|]]]%()*_*^*!!>-],^=");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("2%8:4]<92%1^1]^69:4^.]?>&>1*!829&30:$8[#+}}49$7]+449(>>558@:3:5^+5|)0}4$%}?*0.<>!:[.?*_:%9$<7;.1)30+");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(:+^9?9%{$@(]^9[#|&^%0]0-#*7)!+*60," + "'", str4, "(:+^9?9%{$@(]^9[#|&^%0]0-#*7)!+*60,");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*tgf[PEz)Y$vS)rBQwZ{a:vJVp@wP!dMH?+HIo;w>#C;y(zen$UH" + "'", str4, "*tgf[PEz)Y$vS)rBQwZ{a:vJVp@wP!dMH?+HIo;w>#C;y(zen$UH");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("*tgf[PEz)Y$vS)rBQwZ{a:vJVp@wP!dMH?+HIo;w>#C;y(zen$UH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("{>_|>133].$[-&1-&}{;{)688{&6(>%9(++1:0{0_44=8%?|%][0+16>++40000>{-.5{_=65>59)^7$)*.*3!@{.7?0@[*(+");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, false, true, true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "D(h,5qw8uX00g]hAR=:<nYi46Nni#:^@MA$<ou%%,Ais0k1|kXMUs:A^>M-rt#*z-n.S>E>DZj+Wc.L(&@O3X${35dFC03K}!FHH" + "'", str4, "D(h,5qw8uX00g]hAR=:<nYi46Nni#:^@MA$<ou%%,Ais0k1|kXMUs:A^>M-rt#*z-n.S>E>DZj+Wc.L(&@O3X${35dFC03K}!FHH");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("(:+^9?9%{$@(]^9[#|&^%0]0-#*7)!+*60,");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "|Xj.HabB_B" + "'", str4, "|Xj.HabB_B");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "|-,<).>>)&" + "'", str4, "|-,<).>>)&");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5><!|)4),(:69}}|93^*17_:24&*%!1=%60%1=33}{-6]<81}=3@" + "'", str4, "5><!|)4),(:69}}|93^*17_:24&*%!1=%60%1=33}{-6]<81}=3@");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("|-,<).>>)&");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("|Xj.HabB_B");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4erv6xBTqKoIrv5IYazjBpJvfiZ3R2f8iNnsGEleMmTFsfgJle6Hvuf8RXM7fyOmC8KK4A5YnZYUv9lmnKtEZg5hiDp29q7dg" + "'", str4, "4erv6xBTqKoIrv5IYazjBpJvfiZ3R2f8iNnsGEleMmTFsfgJle6Hvuf8RXM7fyOmC8KK4A5YnZYUv9lmnKtEZg5hiDp29q7dg");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("0521962810");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("oq9u84COolrsc0Z3qLGgUVVr8J5Olahn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".*rBl_Agfd" + "'", str4, ".*rBl_Agfd");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("5><!|)4),(:69}}|93^*17_:24&*%!1=%60%1=33}{-6]<81}=3@");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword(";<+>-|,&<+$___{%);,,);?!,{,##)%_=<]%$}!}^{-=#$:}}}-(^$^?[{#&+%:.^$|$(<!<?=#!,{=(-)|%_+_]@->[,{[-|");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("4erv6xBTqKoIrv5IYazjBpJvfiZ3R2f8iNnsGEleMmTFsfgJle6Hvuf8RXM7fyOmC8KK4A5YnZYUv9lmnKtEZg5hiDp29q7dg");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("{$?}0=.713");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword(".*rBl_Agfd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("D(h,5qw8uX00g]hAR=:<nYi46Nni#:^@MA$<ou%%,Ais0k1|kXMUs:A^>M-rt#*z-n.S>E>DZj+Wc.L(&@O3X${35dFC03K}!FHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4562351691849389268631635788010077748700761938269069396969716348650545088036992399112308650291084929" + "'", str4, "4562351691849389268631635788010077748700761938269069396969716348650545088036992399112308650291084929");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("]{^}$)}{^.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("4562351691849389268631635788010077748700761938269069396969716348650545088036992399112308650291084929");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NDBuaieWBilecBhhaQmbEqbcvrzGRolGeyewnxDCdjxFoxVIjKByrBNIZcucpnHlXPEdAaoTdonysPPidJAlvEGyzjPffdLVJlOe" + "'", str4, "NDBuaieWBilecBhhaQmbEqbcvrzGRolGeyewnxDCdjxFoxVIjKByrBNIZcucpnHlXPEdAaoTdonysPPidJAlvEGyzjPffdLVJlOe");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EZeh[iL|*HBAeY^WTA?:i@xX-xx$RBc%" + "'", str4, "EZeh[iL|*HBAeY^WTA?:i@xX-xx$RBc%");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("NDBuaieWBilecBhhaQmbEqbcvrzGRolGeyewnxDCdjxFoxVIjKByrBNIZcucpnHlXPEdAaoTdonysPPidJAlvEGyzjPffdLVJlOe");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_<]|(+%?_+=<$;;]:;.}#%%[,(%{#);>+>#@;*[:%<=&^}-_){|<},+^|%&)*!<-!<%.(<+:#$,%?]-{*!$!+)?[^;(,-|%#:!)," + "'", str4, "_<]|(+%?_+=<$;;]:;.}#%%[,(%{#);>+>#@;*[:%<=&^}-_){|<},+^|%&)*!<-!<%.(<+:#$,%?]-{*!$!+)?[^;(,-|%#:!),");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "76620445551624181234163364612176" + "'", str4, "76620445551624181234163364612176");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("76620445551624181234163364612176");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("_<]|(+%?_+=<$;;]:;.}#%%[,(%{#);>+>#@;*[:%<=&^}-_){|<},+^|%&)*!<-!<%.(<+:#$,%?]-{*!$!+)?[^;(,-|%#:!),");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6835818395" + "'", str4, "6835818395");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<-iEn,tPTw" + "'", str4, "<-iEn,tPTw");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("?**|};}},%<.!{.|]]]%()*_*^*!!>-],^=");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("EZeh[iL|*HBAeY^WTA?:i@xX-xx$RBc%");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("<-iEn,tPTw");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("6835818395");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}o<@K,5P,YfNb0uO{Y)@EYDzx^#O-r5%^ZW?=arRER$ks:qfTis}+>j&cjO4=*y^n7|Q?Xe[2eQ.OJw-vT|e|4Vodk;Ho4>[l2#X" + "'", str4, "}o<@K,5P,YfNb0uO{Y)@EYDzx^#O-r5%^ZW?=arRER$ks:qfTis}+>j&cjO4=*y^n7|Q?Xe[2eQ.OJw-vT|e|4Vodk;Ho4>[l2#X");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("}o<@K,5P,YfNb0uO{Y)@EYDzx^#O-r5%^ZW?=arRER$ks:qfTis}+>j&cjO4=*y^n7|Q?Xe[2eQ.OJw-vT|e|4Vodk;Ho4>[l2#X");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<:[..?!|[.;=$=^*)_{@)${+}#,)({{,+_(;<^??=#(?,;!$,&{[%!_&;&^^[<(^{*}{^?|@_+.&@<[,+*,>^.>.#|].-+<+#]|&" + "'", str4, "<:[..?!|[.;=$=^*)_{@)${+}#,)({{,+_(;<^??=#(?,;!$,&{[%!_&;&^^[<(^{*}{^?|@_+.&@<[,+*,>^.>.#|].-+<+#]|&");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("<:[..?!|[.;=$=^*)_{@)${+}#,)({{,+_(;<^??=#(?,;!$,&{[%!_&;&^^[<(^{*}{^?|@_+.&@<[,+*,>^.>.#|].-+<+#]|&");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }
}
