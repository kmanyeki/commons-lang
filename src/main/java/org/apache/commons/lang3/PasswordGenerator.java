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

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PasswordGenerator {

    private static final Logger logger = LoggerFactory.getLogger(PasswordGenerator.class);

    public static String generatePassword(int length, boolean useLetters, boolean useNumbers, boolean useSpecialChars) {
        if (length < 7) {
            throw new IllegalArgumentException("Password length must be at least 7.");
        }

        if (!useLetters && !useNumbers && !useSpecialChars) {
            throw new IllegalArgumentException("At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        }

        StringBuilder password = new StringBuilder(length);
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        Random random = new Random();

        if (useLetters) {
            password.append(letters.charAt(random.nextInt(letters.length())));
        }
        if (useNumbers) {
            password.append(numbers.charAt(random.nextInt(numbers.length())));
        }
        if (useSpecialChars) {
            password.append(specialChars.charAt(random.nextInt(specialChars.length())));
        }

        String chars = (useLetters ? letters : "") + (useNumbers ? numbers : "") + (useSpecialChars ? specialChars : "");
        for (int i = password.length(); i < length; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }

        return shuffleString(password.toString(), random);
    }

    private static String shuffleString(String input, Random random) {
        char[] characters = input.toCharArray();
        for (int i = characters.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = characters[i];
            characters[i] = characters[index];
            characters[index] = temp;
        }
        return new String(characters);
    }

    public static boolean validatePassword(String password, boolean useLetters, boolean useNumbers, boolean useSpecialChars) {
        if (password.length() < 7) {
            return false;
        }

        if (useLetters && !password.matches(".*[a-zA-Z].*")) {
            return false;
        }
        if (useNumbers && !password.matches(".*\\d.*")) {
            return false;
        }
        if (useSpecialChars && !password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?].*")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            int length = 0;
            while (length < 7) {
                logger.info("Enter password length (minimum 7): ");
                try {
                    length = scanner.nextInt();
                    if (length < 7) {
                        logger.warn("Password length must be at least 7. Please try again.");
                    }
                } catch (InputMismatchException e) {
                    logger.error("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            }
            scanner.nextLine();

            boolean useLetters = getYesNoInput(scanner, "Use letters? (yes/no): ");
            boolean useNumbers = getYesNoInput(scanner, "Use numbers? (yes/no): ");
            boolean useSpecialChars = getYesNoInput(scanner, "Use special characters? (yes/no): ");

            try {
                String password = generatePassword(length, useLetters, useNumbers, useSpecialChars);
                logger.info("Generated Password: {}", password);
            } catch (IllegalArgumentException e) {
                logger.error("Input error: {}", e.getMessage());
            }
        } catch (Exception e) {
            logger.error("Unexpected error occurred: {}", e.getMessage());
            throw e;
        }
    }

    private static boolean getYesNoInput(Scanner scanner, String prompt) {
        String input;
        while (true) {
            logger.info(prompt);
            input = scanner.nextLine().trim();
            if ("yes".equalsIgnoreCase(input)) {
                return true;
            } else if ("no".equalsIgnoreCase(input)) {
                return false;
            } else {
                logger.warn("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
    }
}
