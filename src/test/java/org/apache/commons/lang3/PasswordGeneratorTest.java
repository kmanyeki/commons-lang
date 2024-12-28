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
    void testGeneratePasswordWithAllCharacterTypes() {
        String password = PasswordGenerator.generatePassword(12, true, true, true);
        assertNotNull(password);
        assertEquals(12, password.length());
        assertTrue(password.matches(".*[a-zA-Z].*"), "Password should contain at least one letter");
        assertTrue(password.matches(".*\\d.*"), "Password should contain at least one number");
        assertTrue(password.matches(".*[!@#$%^&*()-_=+\\[\\]{}|;:,.<>?].*"), "Password should contain at least one special character");
    }

    @Test
    void testGeneratePasswordWithOnlyLetters() {
        String password = PasswordGenerator.generatePassword(10, true, false, false);
        assertNotNull(password);
        assertEquals(10, password.length());
        assertTrue(password.matches("[a-zA-Z]+"), "Password should contain only letters");
    }

    @Test
    void testGeneratePasswordWithInvalidLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PasswordGenerator.generatePassword(6, true, true, true)
        );
        assertEquals("Password length must be at least 7.", exception.getMessage());
    }

    @Test
    void testGeneratePasswordWithNoCharacterTypes() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PasswordGenerator.generatePassword(10, false, false, false)
        );
        assertEquals("At least one of useLetters, useNumbers, or useSpecialChars must be true.", exception.getMessage());
    }
}
