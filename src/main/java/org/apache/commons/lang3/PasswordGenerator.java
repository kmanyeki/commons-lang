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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    private static final Logger logger = LoggerFactory.getLogger(PasswordGenerator.class);

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
        Random random = new Random();

        // Ensure inclusion of at least one character from each requested category
        if (useLetters) {
            password.append(letters.charAt(random.nextInt(letters.length())));
        }
        if (useNumbers) {
            password.append(numbers.charAt(random.nextInt(numbers.length())));
        }
        if (useSpecialChars) {
            password.append(specialChars.charAt(random.nextInt(specialChars.length())));
        }

        // Fill the rest of the password with random characters
        String chars = (useLetters ? letters : "") + (useNumbers ? numbers : "") + (useSpecialChars ? specialChars : "");
        for (int i = password.length(); i < length; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }

        return shuffleString(password.toString(), random);
    }

    /**
     * Shuffles the characters in a string.
     *
     * @param input  the string to shuffle
     * @param random the Random object for shuffling
     * @return the shuffled string
     */
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

    /**
     * Prompts the user for a "yes" or "no" response and validates the input.
     *
     * @param scanner the Scanner object for user input
     * @param prompt  the prompt message to display
     * @return the boolean equivalent of the "yes" or "no" response
     */
    private static boolean getYesNoInput(Scanner scanner, String prompt) {
        String input;
        while (true) {
            logger.info(prompt);
            input = scanner.nextLine().trim().toLowerCase();
            if ("yes".equals(input)) {
                return true;
            } else if ("no".equals(input)) {
                return false;
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
                if (scanner.hasNextInt()) {
                    length = scanner.nextInt();
                    if (length < 7) {
                        logger.warn("Password length must be at least 7. Please try again.");
                    }
                } else {
                    logger.error("Invalid input. Please enter a valid number.");
                    scanner.next(); // Consume invalid input
                }
            }
            scanner.nextLine(); // Consume the newline

            boolean useLetters = getYesNoInput(scanner, "Use letters? (yes/no): ");
            boolean useNumbers = getYesNoInput(scanner, "Use numbers? (yes/no): ");
            boolean useSpecialChars = getYesNoInput(scanner, "Use special characters? (yes/no): ");

            try {
                String password = generatePassword(length, useLetters, useNumbers, useSpecialChars);
                logger.info("Generated Password: {}", password);
            } catch (IllegalArgumentException e) {
                logger.error("Error generating password: {}", e.getMessage());
            }

        } catch (Exception e) {
            logger.error("Unexpected error occurred: {}", e.getMessage());
        }
    }
}
