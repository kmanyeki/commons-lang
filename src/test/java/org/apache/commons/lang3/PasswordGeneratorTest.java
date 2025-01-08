/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed with the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PasswordGeneratorTest {

    @Test
    void testGeneratePassword_withLettersOnly() {
        String password = PasswordGenerator.generatePassword(10, true, false, false);
        assertNotNull(password, "Generated password should not be null");
        assertEquals(10, password.length(), "Password length should be 10");
        assertTrue(password.matches("[a-zA-Z]+"), "Password should contain only letters");
    }

    @Test
    void testGeneratePassword_withNumbersOnly() {
        String password = PasswordGenerator.generatePassword(10, false, true, false);
        assertNotNull(password, "Generated password should not be null");
        assertEquals(10, password.length(), "Password length should be 10");
        assertTrue(password.matches("[0-9]+"), "Password should contain only numbers");
    }

    @Test
    void testGeneratePassword_withSpecialCharsOnly() {
        String specialChars = "!@#$%^&*()-_=+\\[\\]{}|;:,.<>?";
        String password = PasswordGenerator.generatePassword(10, false, false, true);
        assertNotNull(password, "Generated password should not be null");
        assertEquals(10, password.length(), "Password length should be 10");
        assertTrue(password.matches("[" + specialChars + "]+"), "Password should contain only special characters");
    }

    @Test
    void testGeneratePassword_withLettersNumbersAndSpecialChars() {
        String specialChars = "!@#$%^&*()-_=+\\[\\]{}|;:,.<>?";
        String password = PasswordGenerator.generatePassword(15, true, true, true);
        assertNotNull(password, "Generated password should not be null");
        assertEquals(15, password.length(), "Password length should be 15");
        assertTrue(password.matches(".*[a-zA-Z].*"), "Password should contain at least one letter");
        assertTrue(password.matches(".*[0-9].*"), "Password should contain at least one number");
        assertTrue(password.matches(".*[" + specialChars + "].*"), "Password should contain at least one special character");
    }

    @Test
    void testValidatePassword_validPassword() {
        String password = "ValidPassword123!";
        assertEquals("yes", PasswordGenerator.validatePassword(password), "Valid password should return 'yes'");
    }

    @Test
    void testValidatePassword_emptyPassword() {
        String password = "";
        assertEquals("no", PasswordGenerator.validatePassword(password), "Empty password should return 'no'");
    }

    @Test
    void testValidatePassword_nullPassword() {
        String password = null;
        assertEquals("no", PasswordGenerator.validatePassword(password), "Null password should return 'no'");
    }

    @Test
    void testGeneratePassword_invalidLength() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordGenerator.generatePassword(5, true, true, true)
        );
        assertEquals("Password length must be at least 7.", exception.getMessage(), "Error message should match");
    }

    @Test
    void testGeneratePassword_invalidOptions() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordGenerator.generatePassword(10, false, false, false)
        );
        assertEquals("At least one of useLetters, useNumbers, or useSpecialChars must be true.", exception.getMessage(), "Error message should match");
    }
}
