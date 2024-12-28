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
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.commons.lang3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void testGeneratePassword_validInput() {
        // Test generating a password with all character types and valid length
        String password = PasswordGenerator.generatePassword(10, true, true, true);
        assertNotNull(password, "Password should not be null");
        assertEquals(10, password.length(), "Password length should match the requested length");
    }

    @Test
    void testGeneratePassword_minimumLength() {
        // Test the minimum allowed password length
        String password = PasswordGenerator.generatePassword(7, true, true, true);
        assertNotNull(password, "Password should not be null");
        assertEquals(7, password.length(), "Password length should match the minimum length");
    }

    @Test
    void testGeneratePassword_lettersOnly() {
        // Test password with only letters
        String password = PasswordGenerator.generatePassword(12, true, false, false);
        assertTrue(password.matches("[a-zA-Z]+"), "Password should contain only letters");
    }

    @Test
    void testGeneratePassword_numbersOnly() {
        // Test password with only numbers
        String password = PasswordGenerator.generatePassword(12, false, true, false);
        assertTrue(password.matches("[0-9]+"), "Password should contain only numbers");
    }

    @Test
    void testGeneratePassword_specialCharsOnly() {
        // Test password with only special characters
        String password = PasswordGenerator.generatePassword(12, false, false, true);
        assertTrue(password.matches("[!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?]+"), "Password should contain only special characters");
    }

    @Test
    void testGeneratePassword_mixedTypes() {
        // Test password with a mix of letters, numbers, and special characters
        String password = PasswordGenerator.generatePassword(15, true, true, true);
        assertTrue(password.matches(".*[a-zA-Z].*"), "Password should contain letters");
        assertTrue(password.matches(".*[0-9].*"), "Password should contain numbers");
        assertTrue(password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?].*"), "Password should contain special characters");
    }

    @Test
    void testGeneratePassword_invalidLength() {
        // Test that an exception is thrown for invalid length
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> PasswordGenerator.generatePassword(6, true, true, true));
        assertEquals("Password length must be at least 7.", exception.getMessage());
    }

    @Test
    void testGeneratePassword_noCharacterTypesSelected() {
        // Test that an exception is thrown if no character types are selected
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> PasswordGenerator.generatePassword(10, false, false, false));
        assertEquals("At least one of useLetters, useNumbers, or useSpecialChars must be true.", exception.getMessage());
    }
}
