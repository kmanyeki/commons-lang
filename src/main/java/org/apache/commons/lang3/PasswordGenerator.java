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

/**
 * Utility class for generating and validating passwords.
 */
public class PasswordGenerator {

    private static final Logger logger = LoggerFactory.getLogger(PasswordGenerator.class);

    // Reusable Random instance
    private static final Random RANDOM = new Random();

    /**
     * Generates a random password with guaranteed inclusion of requested character types.
     *
     * @param length          the length of the password (must be at least 7)
     * @param useLetters      whether to include letters
     * @param useNumbers      whether to include numbers
     * @param useSpecialChars whether to include special characters
     * @return the generated password
     */
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

        // Ensure inclusion of at least one character from each requested category
        if (useLetters) {
            password.append(letters.charAt(RANDOM.nextInt(letters.length())));
        }
        if (useNumbers) {
            password.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        }
        if (useSpecialChars) {
            password.append(specialChars.charAt(RANDOM.nextInt(specialChars.length())));
        }

        // Fill the rest of the password with random characters
        String chars = (useLetters ? letters : "") + (useNumbers ? numbers : "") + (useSpecialChars ? specialChars : "");
        for (int i = password.length(); i < length; i++) {
            password.append(chars.charAt(RANDOM.nextInt(chars.length())));
        }

        return shuffleString(password.toString());
    }

    /**
     * Shuffles the characters in a string.
     *
     * @param input the string to shuffle
     * @return the shuffled string
     */
    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = characters.length - 1; i > 0; i--) {
            int index = RANDOM.nextInt(i + 1);
            char temp = characters[i];
            characters[i] = characters[index];
            characters[index] = temp;
        }
        return new String(characters);
    }

    /**
     * Validates the provided password against the generation criteria.
     *
     * @param password        the password to validate
     * @param useLetters      whether letters are required
     * @param useNumbers      whether numbers are required
     * @param useSpecialChars whether special characters are required
     * @return "yes" if the password is valid, "no" otherwise
     */
    public static String validatePassword(String password, boolean useLetters, boolean useNumbers, boolean useSpecialChars) {
        if (password == null || password.isEmpty()) {
            return "no";
        }

        boolean hasLetter = password.matches(".*[a-zA-Z].*");
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?].*");

        if (useLetters && !hasLetter) {
            return "no";
        }
        if (useNumbers && !hasNumber) {
            return "no";
        }
        if (useSpecialChars && !hasSpecialChar) {
            return "no";
        }

        return "yes";
    }

    /**
     * Prompts the user for a "yes" or "no" response and validates the input.
     *
     * @param scanner the Scanner object for user input
     * @param prompt  the prompt message to display
     * @return the validated "yes" or "no" response
     */
    public static String getYesNoInput(Scanner scanner, String prompt) {
        String input;
        while (true) {
            logger.info(prompt);
            input = scanner.nextLine().trim();
            if ("yes".equalsIgnoreCase(input) || "no".equalsIgnoreCase(input)) {
                return input.toLowerCase();
            } else {
                logger.warn("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
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
                    scanner.next(); // Consume invalid input
                }
            }
            scanner.nextLine(); // Consume the newline

            String useLetters = getYesNoInput(scanner, "Use letters? (yes/no): ");
            String useNumbers = getYesNoInput(scanner, "Use numbers? (yes/no): ");
            String useSpecialChars = getYesNoInput(scanner, "Use special characters? (yes/no): ");

            try {
                String password = generatePassword(length, "yes".equalsIgnoreCase(useLetters), "yes".equalsIgnoreCase(useNumbers), "yes".equalsIgnoreCase(useSpecialChars));
                logger.info("Generated Password: {}", password);
                String validationResult = validatePassword(password, "yes".equalsIgnoreCase(useLetters), "yes".equalsIgnoreCase(useNumbers), "yes".equalsIgnoreCase(useSpecialChars));
                logger.info("Password Validation Result: {}", validationResult);
            } catch (IllegalArgumentException e) {
                logger.error("Error: {}", e.getMessage());
            }
        } catch (Exception e) {
            logger.error("Unexpected error occurred: {}", e.getMessage());
        }
    }
}
