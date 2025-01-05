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

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordGeneratorTest {

    @Test
    public void testGeneratePassword_AllCharacterTypes() {
        String password = PasswordGenerator.generatePassword(10, true, true, true); // Pass booleans
        assertNotNull(password, "Password should not be null");
        assertEquals(10, password.length(), "Password length should match the specified length");
        assertTrue(password.matches(".*[a-zA-Z].*"), "Password should contain at least one letter");
        assertTrue(password.matches(".*\\d.*"), "Password should contain at least one number");
        assertTrue(password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?].*"), "Password should contain at least one special character");
    }

    @Test
    public void testGeneratePassword_OnlyLetters() {
        String password = PasswordGenerator.generatePassword(10, true, false, false); // Pass booleans
        assertNotNull(password, "Password should not be null");
        assertEquals(10, password.length(), "Password length should match the specified length");
        assertTrue(password.matches("[a-zA-Z]+"), "Password should only contain letters");
    }

    @Test
    public void testGeneratePassword_OnlyNumbers() {
        String password = PasswordGenerator.generatePassword(10, false, true, false); // Pass booleans
        assertNotNull(password, "Password should not be null");
        assertEquals(10, password.length(), "Password length should match the specified length");
        assertTrue(password.matches("\\d+"), "Password should only contain numbers");
    }

    @Test
    public void testGeneratePassword_OnlySpecialCharacters() {
        String password = PasswordGenerator.generatePassword(10, false, false, true); // Pass booleans
        assertNotNull(password, "Password should not be null");
        assertEquals(10, password.length(), "Password length should match the specified length");
        assertTrue(password.matches("[!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?]+"), "Password should only contain special characters");
    }

    @Test
    public void testGeneratePassword_ThrowsExceptionForShortLength() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            PasswordGenerator.generatePassword(6, true, true, true); // Pass booleans
        });
        assertEquals("Password length must be at least 7.", exception.getMessage());
    }

    @Test
    public void testGeneratePassword_ThrowsExceptionForNoCharacterTypes() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            PasswordGenerator.generatePassword(10, false, false, false); // Pass booleans
        });
        assertEquals("At least one of useLetters, useNumbers, or useSpecialChars must be true.", exception.getMessage());
    }
}
