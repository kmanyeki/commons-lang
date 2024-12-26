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

import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PasswordGenerator {

    // SLF4J Logger instance
    private static final Logger logger = LoggerFactory.getLogger(PasswordGenerator.class);

    public static String generatePassword(int length, String useLetters, String useNumbers) {
        if (length <= 0) {
            throw new IllegalArgumentException("Password length must be greater than 0.");
        }

        boolean includeLetters = "yes".equalsIgnoreCase(useLetters);
        boolean includeNumbers = "yes".equalsIgnoreCase(useNumbers);

        if (!includeLetters && !includeNumbers) {
            throw new IllegalArgumentException("At least one of useLetters or useNumbers must be 'yes'.");
        }

        StringBuilder password = new StringBuilder(length);
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String chars = (includeLetters ? letters : "") + (includeNumbers ? numbers : "");

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }

        return password.toString();
    }

    public static String validatePassword(String password, String useLetters, String useNumbers) {
        if (password == null || password.isEmpty()) {
            return "no";
        }

        boolean includeLetters = "yes".equalsIgnoreCase(useLetters);
        boolean includeNumbers = "yes".equalsIgnoreCase(useNumbers);

        boolean hasLetter = password.matches(".*[a-zA-Z].*");
        boolean hasNumber = password.matches(".*\\d.*"); // Use concise character class '\\d'

        if (includeLetters && !hasLetter) {
            return "no";
        }

        if (includeNumbers && !hasNumber) {
            return "no";
        }

        return "yes";
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            logger.info("Enter password length: ");
            int length = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            logger.info("Use letters? (yes/no): ");
            String useLetters = scanner.nextLine();

            logger.info("Use numbers? (yes/no): ");
            String useNumbers = scanner.nextLine();

            String password = generatePassword(length, useLetters, useNumbers);
            logger.info("Generated Password: {}", password);

            String validationResult = validatePassword(password, useLetters, useNumbers);
            logger.info("Generated Password Validation: {}", validationResult);
        } catch (IllegalArgumentException e) {
            logger.error("Error: {}", e.getMessage());
        }
    }
}
