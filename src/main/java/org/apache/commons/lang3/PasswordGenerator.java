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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.text.RandomStringGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for generating passwords using Apache Commons libraries.
 */
public class PasswordGenerator {

    private static final Logger logger = LoggerFactory.getLogger(PasswordGenerator.class);

    /**
     * Generates a random password using Apache Commons Text's RandomStringGenerator.
     *
     * @param length          the length of the password (must be at least 7)
     * @param useLetters      whether to include letters
     * @param useNumbers      whether to include numbers
     * @param useSpecialChars whether to include special characters
     * @return the generated password
     * @throws IllegalArgumentException if parameters are invalid
     */
    public static String generatePassword(int length, boolean useLetters, boolean useNumbers, boolean useSpecialChars) {
        if (length < 7) {
            logger.error("Password length must be at least 7.");
            throw new IllegalArgumentException("Password length must be at least 7.");
        }

        if (!useLetters && !useNumbers && !useSpecialChars) {
            logger.error("At least one of useLetters, useNumbers, or useSpecialChars must be true.");
            throw new IllegalArgumentException("At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        }

        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        List<Character> password = new ArrayList<>();

        RandomStringGenerator.Builder builder = new RandomStringGenerator.Builder();

        if (useLetters) {
            password.add(builder.withinRange('a', 'z').build().generate(1).charAt(0));
        }

        if (useNumbers) {
            password.add(builder.withinRange('0', '9').build().generate(1).charAt(0));
        }

        if (useSpecialChars) {
            password.add(builder.selectFrom(specialChars.toCharArray()).build().generate(1).charAt(0));
        }

        String characterSet = "";
        if (useLetters) {
            characterSet += "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (useNumbers) {
            characterSet += "0123456789";
        }
        if (useSpecialChars) {
            characterSet += specialChars;
        }
        while (password.size() < length) {
            password.add(builder.selectFrom(characterSet.toCharArray()).build().generate(1).charAt(0));
        }

        Collections.shuffle(password); // Shuffle to ensure randomness

        StringBuilder result = new StringBuilder();
        for (char c : password) {
            result.append(c);
        }

        return result.toString();
    }

    /**
     * Validates a password to check if it is empty or null.
     *
     * @param password the password to validate
     * @return "yes" if the password is valid, "no" otherwise
     */
    public static String validatePassword(String password) {
        if (StringUtils.isEmpty(password)) {
            logger.warn("Password is empty or null.");
            return "no";
        }
        return "yes";
    }

    /**
     * Prompts the user for a "yes" or "no" input.
     *
     * @param inputSupplier a supplier for user input
     * @param prompt        the prompt to display
     * @return true for "yes", false for "no"
     */
    private static boolean getYesNoInput(Supplier<String> inputSupplier, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = inputSupplier.get().trim().toLowerCase();
                if ("yes".equals(input)) {
                    return true;
                } else if ("no".equals(input)) {
                    return false;
                } else {
                    logger.warn("Invalid input. Please enter 'yes' or 'no'.");
                }
            } catch (Exception e) {
                logger.error("Error reading input: {}", e.getMessage());
            }
        }
    }

    /**
     * Main method for testing the PasswordGenerator functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            logger.info("Welcome to the Password Generator!");

            int length = 0;
            while (length < 7) {
                try {
                    logger.info("Enter the desired password length (minimum 7): ");
                    length = NumberUtils.toInt(scanner.nextLine(), 0);
                    if (length < 7) {
                        logger.warn("Password length must be at least 7.");
                    }
                } catch (Exception e) {
                    logger.error("Invalid input. Please enter a numeric value.");
                }
            }

            Supplier<String> inputSupplier = () -> {
                System.out.print("> ");
                return scanner.nextLine();
            };

            boolean useLetters = getYesNoInput(inputSupplier, "Include letters in the password? (yes/no): ");
            boolean useNumbers = getYesNoInput(inputSupplier, "Include numbers in the password? (yes/no): ");
            boolean useSpecialChars = getYesNoInput(inputSupplier, "Include special characters in the password? (yes/no): ");

            try {
                String password = generatePassword(length, useLetters, useNumbers, useSpecialChars);
                logger.info("Generated Password: {}", password);

                String validationResult = validatePassword(password);
                logger.info("Password Validation: {}", validationResult);
            } catch (IllegalArgumentException e) {
                logger.error("Error: {}", e.getMessage());
            }

        } catch (Exception e) {
            logger.error("Unexpected error occurred: {}", e.getMessage());
        }
    }
}
