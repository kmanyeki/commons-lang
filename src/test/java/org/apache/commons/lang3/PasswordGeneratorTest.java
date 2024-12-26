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
    void testGeneratePasswordValidInput() {
        // Generate a password of length 10 with letters and numbers
        String password = PasswordGenerator.generatePassword(10, "yes", "yes");
        assertEquals(10, password.length());
        assertTrue(password.matches(".*[a-zA-Z].*")); // Contains letters
        assertTrue(password.matches(".*\\d.*"));     // Contains numbers
    }

    @Test
    void testGeneratePasswordOnlyLetters() {
        // Generate a password of length 8 with only letters
        String password = PasswordGenerator.generatePassword(8, "yes", "no");
        assertEquals(8, password.length());
        assertTrue(password.matches(".*[a-zA-Z].*")); // Contains letters
        assertFalse(password.matches(".*\\d.*"));     // No numbers
    }

    @Test
    void testGeneratePasswordOnlyNumbers() {
        // Generate a password of length 6 with only numbers
        String password = PasswordGenerator.generatePassword(6, "no", "yes");
        assertEquals(6, password.length());
        assertTrue(password.matches(".*\\d.*"));      // Contains numbers
        assertFalse(password.matches(".*[a-zA-Z].*")); // No letters
    }

    @Test
    void testGeneratePasswordInvalidLength() {
        // Generate a password with invalid length (e.g., 0)
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PasswordGenerator.generatePassword(0, "yes", "yes"));
        assertEquals("Password length must be greater than 0.", exception.getMessage());
    }

    @Test
    void testGeneratePasswordNoOptions() {
        // Generate a password without letters or numbers
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PasswordGenerator.generatePassword(8, "no", "no"));
        assertEquals("At least one of useLetters or useNumbers must be 'yes'.", exception.getMessage());
    }

    @Test
    void testValidatePasswordValid() {
        // Validate a valid password
        String password = "abc123";
        assertEquals("yes", PasswordGenerator.validatePassword(password, "yes", "yes"));
    }

    @Test
    void testValidatePasswordMissingLetters() {
        // Validate a password missing letters
        String password = "123456";
        assertEquals("no", PasswordGenerator.validatePassword(password, "yes", "no"));
    }

    @Test
    void testValidatePasswordMissingNumbers() {
        // Validate a password missing numbers
        String password = "abcdef";
        assertEquals("no", PasswordGenerator.validatePassword(password, "no", "yes"));
    }

    @Test
    void testValidatePasswordEmpty() {
        // Validate an empty password
        assertEquals("no", PasswordGenerator.validatePassword("", "yes", "yes"));
    }

    @Test
    void testValidatePasswordNull() {
        // Validate a null password
        assertEquals("no", PasswordGenerator.validatePassword(null, "yes", "yes"));
    }
}


