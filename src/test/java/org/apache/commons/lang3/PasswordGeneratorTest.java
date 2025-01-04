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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PasswordGeneratorTest {

    @Test
    void testGeneratePassword_validInput() {
        String password = PasswordGenerator.generatePassword(10, true, true, true);
        assertNotNull(password);
        assertEquals(10, password.length());
    }

    @Test
    void testGeneratePassword_minimumLength() {
        String password = PasswordGenerator.generatePassword(7, true, true, true);
        assertNotNull(password);
        assertEquals(7, password.length());
    }

    @Test
    void testGeneratePassword_lettersOnly() {
        String password = PasswordGenerator.generatePassword(12, true, false, false);
        assertTrue(password.matches("[a-zA-Z]+"));
    }

    @Test
    void testGeneratePassword_numbersOnly() {
        String password = PasswordGenerator.generatePassword(12, false, true, false);
        assertTrue(password.matches("[0-9]+"));
    }

    @Test
    void testGeneratePassword_specialCharsOnly() {
        String password = PasswordGenerator.generatePassword(12, false, false, true);
        assertTrue(password.matches("[!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?]+"));
    }

    @Test
    void testGeneratePassword_mixedTypes() {
        String password = PasswordGenerator.generatePassword(15, true, true, true);
        assertTrue(password.matches(".*[a-zA-Z].*"));
        assertTrue(password.matches(".*[0-9].*"));
        assertTrue(password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?].*"));
    }

    @Test
    void testGeneratePassword_invalidLength() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> PasswordGenerator.generatePassword(6, true, true, true));
        assertEquals("Password length must be at least 7.", exception.getMessage());
    }

    @Test
    void testGeneratePassword_noCharacterTypesSelected() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> PasswordGenerator.generatePassword(10, false, false, false));
        assertEquals("At least one of useLetters, useNumbers, or useSpecialChars must be true.", exception.getMessage());
    }
}
