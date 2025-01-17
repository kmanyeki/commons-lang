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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eMyPhXjgGK" + "'", str4, "eMyPhXjgGK");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zWQ:mG6^tr" + "'", str4, "zWQ:mG6^tr");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("zWQ:mG6^tr");
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
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("eMyPhXjgGK");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fRLUygjBEJ" + "'", str4, "fRLUygjBEJ");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*%?:7.,$.," + "'", str4, "*%?:7.,$.,");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3316250492757615980603669005327482887872311157797619478349368572529965184471261872960430468149290" + "'", str4, "3316250492757615980603669005327482887872311157797619478349368572529965184471261872960430468149290");
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LN(tAax.O)-*8yG*>6yaH$nZQFjn=MxFj[4" + "'", str4, "LN(tAax.O)-*8yG*>6yaH$nZQFjn=MxFj[4");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@K|QDw+^}txRPm?t[|p%dNrg[lO:aa|wW^Wjf++ce_x]F+d%Qni%^e}ivIDCN!v}Fl=EDRd[jHPK#cepp?nCIlqD%YG*@S?S;AfX" + "'", str4, "@K|QDw+^}txRPm?t[|p%dNrg[lO:aa|wW^Wjf++ce_x]F+d%Qni%^e}ivIDCN!v}Fl=EDRd[jHPK#cepp?nCIlqD%YG*@S?S;AfX");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rEIUy5gD4R8maZBMryDRHdySAh5bpdTVNlAOrCrVf2AJH1E4QPZv" + "'", str4, "rEIUy5gD4R8maZBMryDRHdySAh5bpdTVNlAOrCrVf2AJH1E4QPZv");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "XdN7h9ad7YFS5aFy7O4q0liQsV3MzuOhX7m" + "'", str4, "XdN7h9ad7YFS5aFy7O4q0liQsV3MzuOhX7m");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6651604934180578318234867457392917330086567649745718" + "'", str4, "6651604934180578318234867457392917330086567649745718");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "*]1!:#3[3=;>79$:}4816:];5??5|1:%" + "'", str4, "*]1!:#3[3=;>79$:}4816:];5??5|1:%");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2678651478607819046093425035051254011858799847435783002405117295751598555618550988256357559409461375" + "'", str4, "2678651478607819046093425035051254011858799847435783002405117295751598555618550988256357559409461375");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("*]1!:#3[3=;>79$:}4816:];5??5|1:%");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7DEXLujxqpwNsxMG3xfJLLXreA1CgGdRjJj2n9VpiOQLdoU1iBrcC7KwyMvh22wmtYYM66gLWbD6DcxqgdlVuvvfqdj9Mi50r167" + "'", str4, "7DEXLujxqpwNsxMG3xfJLLXreA1CgGdRjJj2n9VpiOQLdoU1iBrcC7KwyMvh22wmtYYM66gLWbD6DcxqgdlVuvvfqdj9Mi50r167");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8582856702393400628171036535251852545074447486496976681232049101940013824876211891942114601511273293" + "'", str4, "8582856702393400628171036535251852545074447486496976681232049101940013824876211891942114601511273293");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2>8Yq)vc[w" + "'", str4, "2>8Yq)vc[w");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("rEIUy5gD4R8maZBMryDRHdySAh5bpdTVNlAOrCrVf2AJH1E4QPZv");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("2678651478607819046093425035051254011858799847435783002405117295751598555618550988256357559409461375");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("*%?:7.,$.,");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("XdN7h9ad7YFS5aFy7O4q0liQsV3MzuOhX7m");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".[>($^%-^)" + "'", str4, ".[>($^%-^)");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword(".[>($^%-^)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', true, true, true);
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
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("fRLUygjBEJ");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("7DEXLujxqpwNsxMG3xfJLLXreA1CgGdRjJj2n9VpiOQLdoU1iBrcC7KwyMvh22wmtYYM66gLWbD6DcxqgdlVuvvfqdj9Mi50r167");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HagQcjiY>bu,d+cPvqD*_#yVgqLua[@Booy=^zC&gOTFsAq!wI}!,)|lI]X(F:x$Hhb!s@&Ki{?<O)HL-Gp]Hs+KPls+|DpOF" + "'", str4, "HagQcjiY>bu,d+cPvqD*_#yVgqLua[@Booy=^zC&gOTFsAq!wI}!,)|lI]X(F:x$Hhb!s@&Ki{?<O)HL-Gp]Hs+KPls+|DpOF");
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "66236159400524995328190173275161570" + "'", str4, "66236159400524995328190173275161570");
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "sggUtXwlnbdRQLKALjgKAseIxwxvXNHXQwCXVnQfaDDoIKNKkNQF" + "'", str4, "sggUtXwlnbdRQLKALjgKAseIxwxvXNHXQwCXVnQfaDDoIKNKkNQF");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("6651604934180578318234867457392917330086567649745718");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HzdjDZ3UY7QZkv8lT2bVz6XTzQykUJOVCapcglWx4rYjEUOYZVa0fPNpTTvSH3XePDRg4gBa06E4siB1cXeGg5bx14lWyNjFzOkd" + "'", str4, "HzdjDZ3UY7QZkv8lT2bVz6XTzQykUJOVCapcglWx4rYjEUOYZVa0fPNpTTvSH3XePDRg4gBa06E4siB1cXeGg5bx14lWyNjFzOkd");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("2>8Yq)vc[w");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GzXjKBvvzFBPInfTwWDelWatipUhhWyqoCx" + "'", str4, "GzXjKBvvzFBPInfTwWDelWatipUhhWyqoCx");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("sggUtXwlnbdRQLKALjgKAseIxwxvXNHXQwCXVnQfaDDoIKNKkNQF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_SrV*bG1km*Ikz7eM4}SMb3>lbgXu%=kZF^;gz%Ia$|(#YMmS[|]|&CDz[4O-,h,n%kcl#+[w06vyGTEm>1|Zoo+FzLhwE)?_X*l" + "'", str4, "_SrV*bG1km*Ikz7eM4}SMb3>lbgXu%=kZF^;gz%Ia$|(#YMmS[|]|&CDz[4O-,h,n%kcl#+[w06vyGTEm>1|Zoo+FzLhwE)?_X*l");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1aVhHCDaeZSHLHUDSeNF4SXPPfhZCZBI3hdvPOiAgQOF2xiNEU6vPrtnGQkUQuML8ZFWrWkDevCkENeUJMYPTd1cxxTusiD9csjK" + "'", str4, "1aVhHCDaeZSHLHUDSeNF4SXPPfhZCZBI3hdvPOiAgQOF2xiNEU6vPrtnGQkUQuML8ZFWrWkDevCkENeUJMYPTd1cxxTusiD9csjK");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("@K|QDw+^}txRPm?t[|p%dNrg[lO:aa|wW^Wjf++ce_x]F+d%Qni%^e}ivIDCN!v}Fl=EDRd[jHPK#cepp?nCIlqD%YG*@S?S;AfX");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("_SrV*bG1km*Ikz7eM4}SMb3>lbgXu%=kZF^;gz%Ia$|(#YMmS[|]|&CDz[4O-,h,n%kcl#+[w06vyGTEm>1|Zoo+FzLhwE)?_X*l");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U=dCO@.|)7YC,Nb](N:Dxs1$kdx0A]Gi" + "'", str4, "U=dCO@.|)7YC,Nb](N:Dxs1$kdx0A]Gi");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RctOamcggEqJiasVTRcBvWmozskqcbckNNXYAJWLeMMTweErmZqxohbfrZEPOsFkPEsRuRteFueKwiQympLKTPxCXyDkTtmmdOqF" + "'", str4, "RctOamcggEqJiasVTRcBvWmozskqcbckNNXYAJWLeMMTweErmZqxohbfrZEPOsFkPEsRuRteFueKwiQympLKTPxCXyDkTtmmdOqF");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("LN(tAax.O)-*8yG*>6yaH$nZQFjn=MxFj[4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("GzXjKBvvzFBPInfTwWDelWatipUhhWyqoCx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', true, true, true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("1aVhHCDaeZSHLHUDSeNF4SXPPfhZCZBI3hdvPOiAgQOF2xiNEU6vPrtnGQkUQuML8ZFWrWkDevCkENeUJMYPTd1cxxTusiD9csjK");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("HzdjDZ3UY7QZkv8lT2bVz6XTzQykUJOVCapcglWx4rYjEUOYZVa0fPNpTTvSH3XePDRg4gBa06E4siB1cXeGg5bx14lWyNjFzOkd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sisp6H72Qc" + "'", str4, "Sisp6H72Qc");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, true, false, true);
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
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "^$@.,][,&#<]#%,<<^(;{{[#]$.>*_*[++$?_,|.?]}){?>^$=_%._<%.><+>*|+.<{+(,?#!#<&--(=}_,.[;<<-._@#<][*" + "'", str4, "^$@.,][,&#<]#%,<<^(;{{[#]$.>*_*[++$?_,|.?]}){?>^$=_%._<%.><+>*|+.<{+(,?#!#<&--(=}_,.[;<<-._@#<][*");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("Sisp6H72Qc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ryYDhwznQTyZtirVViwdpSETIDLrNzMn" + "'", str4, "ryYDhwznQTyZtirVViwdpSETIDLrNzMn");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("8582856702393400628171036535251852545074447486496976681232049101940013824876211891942114601511273293");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "|q%JQD[omu%gzut<%Zv+#slXlY?PkiT!fQ|N$zR<]H^o+U|sSWYFTXIOUEPZ:n=(!WKHxk[H>qw}+L;VXZnx=LnhxrA=;nE!<wfV" + "'", str4, "|q%JQD[omu%gzut<%Zv+#slXlY?PkiT!fQ|N$zR<]H^o+U|sSWYFTXIOUEPZ:n=(!WKHxk[H>qw}+L;VXZnx=LnhxrA=;nE!<wfV");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "?|}[;]{{[+^!!<[,>,)(+<^:[}=}-}^#>{%.]};-,|};:,_+#=.>{{|}$^{]@%}&_+_*?!@}&.([%#!|%(.>&&#%{={:$-=*,}|<" + "'", str4, "?|}[;]{{[+^!!<[,>,)(+<^:[}=}-}^#>{%.]};-,|};:,_+#=.>{{|}$^{]@%}&_+_*?!@}&.([%#!|%(.>&&#%{={:$-=*,}|<");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("3316250492757615980603669005327482887872311157797619478349368572529965184471261872960430468149290");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("HagQcjiY>bu,d+cPvqD*_#yVgqLua[@Booy=^zC&gOTFsAq!wI}!,)|lI]X(F:x$Hhb!s@&Ki{?<O)HL-Gp]Hs+KPls+|DpOF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "pfpX@L?gMas-g&EHz!-EnJ%C)p=m)g%H.W_" + "'", str4, "pfpX@L?gMas-g&EHz!-EnJ%C)p=m)g%H.W_");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
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
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
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
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) -1, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "leNFmrfyCvRMTXPctLroRuNdCgeCtzfulEcqjIuwQHaZcYijwLUJcwKmDCSQESKnYcYvxOYcrEYLCoMBBAxNSkNrTppQADqsUDut" + "'", str4, "leNFmrfyCvRMTXPctLroRuNdCgeCtzfulEcqjIuwQHaZcYijwLUJcwKmDCSQESKnYcYvxOYcrEYLCoMBBAxNSkNrTppQADqsUDut");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("?|}[;]{{[+^!!<[,>,)(+<^:[}=}-}^#>{%.]};-,|};:,_+#=.>{{|}$^{]@%}&_+_*?!@}&.([%#!|%(.>&&#%{={:$-=*,}|<");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "l&q>cKqlkC.^j?}PnF$o{>smTStFtB[z!pnwjD;^mK(W*{eY@.(LHsXv?ZrUkSAG!eFpRL)L=&%?{S.x*mjJnm{lch%,plBZkU^l" + "'", str4, "l&q>cKqlkC.^j?}PnF$o{>smTStFtB[z!pnwjD;^mK(W*{eY@.(LHsXv?ZrUkSAG!eFpRL)L=&%?{S.x*mjJnm{lch%,plBZkU^l");
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
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("66236159400524995328190173275161570");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tnnjcREXsp" + "'", str4, "tnnjcREXsp");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=Iyp4ip1G!" + "'", str4, "=Iyp4ip1G!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2948723518" + "'", str4, "2948723518");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "27?]5$^{99" + "'", str4, "27?]5$^{99");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("ryYDhwznQTyZtirVViwdpSETIDLrNzMn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("U=dCO@.|)7YC,Nb](N:Dxs1$kdx0A]Gi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
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
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8Kq9TTgWxg" + "'", str4, "8Kq9TTgWxg");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("leNFmrfyCvRMTXPctLroRuNdCgeCtzfulEcqjIuwQHaZcYijwLUJcwKmDCSQESKnYcYvxOYcrEYLCoMBBAxNSkNrTppQADqsUDut");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "16KPjNU6Sv" + "'", str4, "16KPjNU6Sv");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("RctOamcggEqJiasVTRcBvWmozskqcbckNNXYAJWLeMMTweErmZqxohbfrZEPOsFkPEsRuRteFueKwiQympLKTPxCXyDkTtmmdOqF");
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kMVekselkLzdCbrsjPRtQqcNsDIHEdxBncbSkRwHfIcuoZtnyrplfcngoPGCFDQPjDuPQbCSrFhZEiFzidMjubzUuNFWszUqu" + "'", str4, "kMVekselkLzdCbrsjPRtQqcNsDIHEdxBncbSkRwHfIcuoZtnyrplfcngoPGCFDQPjDuPQbCSrFhZEiFzidMjubzUuNFWszUqu");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("27?]5$^{99");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("tnnjcREXsp");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
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
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("^$@.,][,&#<]#%,<<^(;{{[#]$.>*_*[++$?_,|.?]}){?>^$=_%._<%.><+>*|+.<{+(,?#!#<&--(=}_,.[;<<-._@#<][*");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("kMVekselkLzdCbrsjPRtQqcNsDIHEdxBncbSkRwHfIcuoZtnyrplfcngoPGCFDQPjDuPQbCSrFhZEiFzidMjubzUuNFWszUqu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "?,]95>4^<6" + "'", str4, "?,]95>4^<6");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("?,]95>4^<6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("l&q>cKqlkC.^j?}PnF$o{>smTStFtB[z!pnwjD;^mK(W*{eY@.(LHsXv?ZrUkSAG!eFpRL)L=&%?{S.x*mjJnm{lch%,plBZkU^l");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("16KPjNU6Sv");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(-#{#{{#[=]{{{^.)=;*!!!&;$]|+.}#" + "'", str4, "(-#{#{{#[=]{{{^.)=;*!!!&;$]|+.}#");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=)@$.)!||?@{|)+!|><%;;<!,+!*#-<?+||<=&:;)^$|[$-+?,_-" + "'", str4, "=)@$.)!||?@{|)+!|><%;;<!,+!*#-<?+||<=&:;)^$|[$-+?,_-");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("8Kq9TTgWxg");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) -1, true, false, true);
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
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("pfpX@L?gMas-g&EHz!-EnJ%C)p=m)g%H.W_");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', true, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cpu1LxcxT5Fw4rzh5JalRl75S7S55Ap7" + "'", str4, "Cpu1LxcxT5Fw4rzh5JalRl75S7S55Ap7");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("=)@$.)!||?@{|)+!|><%;;<!,+!*#-<?+||<=&:;)^$|[$-+?,_-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) 'a', false, true, true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("(-#{#{{#[=]{{{^.)=;*!!!&;$]|+.}#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5532511647" + "'", str4, "5532511647");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("|q%JQD[omu%gzut<%Zv+#slXlY?PkiT!fQ|N$zR<]H^o+U|sSWYFTXIOUEPZ:n=(!WKHxk[H>qw}+L;VXZnx=LnhxrA=;nE!<wfV");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_!!%(@||&^" + "'", str4, "_!!%(@||&^");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "({!<8:0=9&]<9}>^35{)8(^{(99$3|?]37!>2<-{*^05486+&_?9+4#]5]9&+(>[}3.<[9&.311__)-9.0&2*{*$>]{0>5#=6-[|" + "'", str4, "({!<8:0=9&]<9}>^35{)8(^{(99$3|?]37!>2<-{*^05486+&_?9+4#]5]9&+(>[}3.<[9&.311__)-9.0&2*{*$>]{0>5#=6-[|");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 0, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(!<,,!>.*+$:-!)%::#%}),^!!#}[[-<+_@" + "'", str4, "(!<,,!>.*+$:-!)%::#%}),^!!#}[[-<+_@");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '#', false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(.3&3&!{_!0#(#=[0([@|_2*,_5{]22;]6;" + "'", str4, "(.3&3&!{_!0#(#=[0([@|_2*,_5{]22;]6;");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "|cg^Hxi+oed,{|s>LtJ%*fSXr&<]sAndZfyOaZjih>bzOkM$Cy[I" + "'", str4, "|cg^Hxi+oed,{|s>LtJ%*fSXr&<]sAndZfyOaZjih>bzOkM$Cy[I");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, false, true, true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("5532511647");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, true, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dCho+Qe8_2XJ<%96,+>!{Ylm8q2Zmj&|]9]%wXBotCb^H;;zv6b575ToNcav#{-AE9l%HOL{pxNm$0r{-3veqZz7Z5:LFQ&]0-V<" + "'", str4, "dCho+Qe8_2XJ<%96,+>!{Ylm8q2Zmj&|]9]%wXBotCb^H;;zv6b575ToNcav#{-AE9l%HOL{pxNm$0r{-3veqZz7Z5:LFQ&]0-V<");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 10, true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]laj($)v@l" + "'", str4, "]laj($)v@l");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("=Iyp4ip1G!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}):%^=|-_{" + "'", str4, "}):%^=|-_{");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) '4', false, true, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-%5|&?031(>&7^2_$+%[|?(0}7%@>{<}*?(<%%=][1;=&-.=}6|5" + "'", str4, "-%5|&?031(>&7^2_$+%[|?(0}7%@>{<}*?(<%%=][1;=&-.=}6|5");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((-1), false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("|cg^Hxi+oed,{|s>LtJ%*fSXr&<]sAndZfyOaZjih>bzOkM$Cy[I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("({!<8:0=9&]<9}>^35{)8(^{(99$3|?]37!>2<-{*^05486+&_?9+4#]5]9&+(>[}3.<[9&.311__)-9.0&2*{*$>]{0>5#=6-[|");
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P6eD56JuewU6jIvqdWwYSfB5eTb2bf9V80ANP52af42UcKrTwVDSwyYUUtUGLSf334t4QcwkyFoLrl6N1MljBudUm3Rq4U4Mn" + "'", str4, "P6eD56JuewU6jIvqdWwYSfB5eTb2bf9V80ANP52af42UcKrTwVDSwyYUUtUGLSf334t4QcwkyFoLrl6N1MljBudUm3Rq4U4Mn");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("-%5|&?031(>&7^2_$+%[|?(0}7%@>{<}*?(<%%=][1;=&-.=}6|5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("_!!%(@||&^");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("}):%^=|-_{");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("dCho+Qe8_2XJ<%96,+>!{Ylm8q2Zmj&|]9]%wXBotCb^H;;zv6b575ToNcav#{-AE9l%HOL{pxNm$0r{-3veqZz7Z5:LFQ&]0-V<");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "sYUiuZ_c_%" + "'", str4, "sYUiuZ_c_%");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("(.3&3&!{_!0#(#=[0([@|_2*,_5{]22;]6;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("(!<,,!>.*+$:-!)%::#%}),^!!#}[[-<+_@");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("Cpu1LxcxT5Fw4rzh5JalRl75S7S55Ap7");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("2948723518");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9114092274553474519624251228231653980350080334012109095941063726547849892417050499221552749354006304" + "'", str4, "9114092274553474519624251228231653980350080334012109095941063726547849892417050499221552749354006304");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(100, true, false, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RerpfFhKnwrMmlsqkERrTupCqNlKjaYHwThYMaeoyvuNjmiJvQqUxJEcaVpHIqMlFeozhnYkiIxxNEKqtSPXTAxDyOYkboxznymh" + "'", str4, "RerpfFhKnwrMmlsqkERrTupCqNlKjaYHwThYMaeoyvuNjmiJvQqUxJEcaVpHIqMlFeozhnYkiIxxNEKqtSPXTAxDyOYkboxznymh");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "N?>=?Ye{gjXyn^z:ZV+x(QBS|X=r%r^o" + "'", str4, "N?>=?Ye{gjXyn^z:ZV+x(QBS|X=r%r^o");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("RerpfFhKnwrMmlsqkERrTupCqNlKjaYHwThYMaeoyvuNjmiJvQqUxJEcaVpHIqMlFeozhnYkiIxxNEKqtSPXTAxDyOYkboxznymh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "%!#&$>[>-{%&(@_$[];%)&.&@?+}^*%&{#(!+@@&<=>+_]::;@}-(}||<],?<^(:!,>[+||!%.[<{[#+-.:#);,*?%_&]-{!>#%^" + "'", str4, "%!#&$>[>-{%&(@_$[];%)&.&@?+}^*%&{#(!+@@&<=>+_]::;@}-(}||<],?<^(:!,>[+||!%.[<{[#+-.:#);,*?%_&]-{!>#%^");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) ' ', false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "67313557252825135894493695193395" + "'", str4, "67313557252825135894493695193395");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("9114092274553474519624251228231653980350080334012109095941063726547849892417050499221552749354006304");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 1, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("N?>=?Ye{gjXyn^z:ZV+x(QBS|X=r%r^o");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("]laj($)v@l");
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
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 10, false, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9286640838" + "'", str4, "9286640838");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(10, true, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "%s=%-bnRAQ" + "'", str4, "%s=%-bnRAQ");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("%s=%-bnRAQ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
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
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("sYUiuZ_c_%");
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
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("P6eD56JuewU6jIvqdWwYSfB5eTb2bf9V80ANP52af42UcKrTwVDSwyYUUtUGLSf334t4QcwkyFoLrl6N1MljBudUm3Rq4U4Mn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(0, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("%!#&$>[>-{%&(@_$[];%)&.&@?+}^*%&{#(!+@@&<=>+_]::;@}-(}||<],?<^(:!,>[+||!%.[<{[#+-.:#);,*?%_&]-{!>#%^");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("9286640838");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("67313557252825135894493695193395");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword(1, true, false, true);
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
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 0, false, true, false);
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
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 1, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password length must be at least 7.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (short) 100, true, true, true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str4 = org.apache.commons.lang3.PasswordGenerator.generatePassword((int) (byte) 100, false, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "?:>^|^^;%}>.),(,()=@$)?>|)_+|(&>>+&??{]%=@:%=._>?})#(:).=]>(!;${($;,@}]-#::|<*+)_}=>%>^&-+-[#._^[{[:" + "'", str4, "?:>^|^^;%}>.),(,()=@$)?>|)_+|(&>>+&??{]%=@:%=._>?})#(:).=]>(!;${($;,@}]-#::|<*+)_}=>%>^&-+-[#._^[{[:");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.String str1 = org.apache.commons.lang3.PasswordGenerator.validatePassword("?:>^|^^;%}>.),(,()=@$)?>|)_+|(&>>+&??{]%=@:%=._>?})#(:).=]>(!;${($;,@}]-#::|<*+)_}=>%>^&-+-[#._^[{[:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }
}
