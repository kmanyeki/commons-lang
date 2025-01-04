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
    private static final Random random = new Random();
    private static final int MIN_PASSWORD_LENGTH = 7;

    public static String generatePassword(int length, boolean useLetters, boolean useNumbers, boolean useSpecialChars) {
        if (length < MIN_PASSWORD_LENGTH) {
            throw new IllegalArgumentException("Password length must be at least " + MIN_PASSWORD_LENGTH + ".");
        }
        if (!useLetters && !useNumbers && !useSpecialChars) {
            throw new IllegalArgumentException("At least one of useLetters, useNumbers, or useSpecialChars must be true.");
        }

        StringBuilder password = new StringBuilder(length);
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        if (useLetters) {
            password.append(letters.charAt(random.nextInt(letters.length())));
        }
        if (useNumbers) {
            password.append(numbers.charAt(random.nextInt(numbers.length())));
        }
        if (useSpecialChars) {
            password.append(specialChars.charAt(random.nextInt(specialChars.length())));
        }

        String allChars = "";
        if (useLetters) {
            allChars += letters;
        }
        if (useNumbers) {
            allChars += numbers;
        }
        if (useSpecialChars) {
            allChars += specialChars;
        }

        while (password.length() < length) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        logger.info("Generated password: {}", password);
        return password.toString();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = 0;
            boolean useLetters = false, useNumbers = false, useSpecialChars = false;

            while (true) {
                try {
                    System.out.println("Enter password length (at least 7):");
                    length = scanner.nextInt();
                    if (length < MIN_PASSWORD_LENGTH) {
                        throw new IllegalArgumentException("Password length must be at least " + MIN_PASSWORD_LENGTH + ".");
                    }
                    break; // Valid input; exit loop
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    logger.error("Invalid input for password length: {}", e.getMessage());
                    scanner.next(); // Clear invalid input
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    logger.error("Error: {}", e.getMessage());
                }
            }

            while (true) {
                try {
                    System.out.println("Include letters? (true/false):");
                    useLetters = scanner.nextBoolean();

                    System.out.println("Include numbers? (true/false):");
                    useNumbers = scanner.nextBoolean();

                    System.out.println("Include special characters? (true/false):");
                    useSpecialChars = scanner.nextBoolean();

                    if (!useLetters && !useNumbers && !useSpecialChars) {
                        throw new IllegalArgumentException("At least one character type must be selected.");
                    }
                    break; // Valid input; exit loop
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter 'true' or 'false'.");
                    logger.error("Invalid boolean input: {}", e.getMessage());
                    scanner.next(); // Clear invalid input
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    logger.error("Error: {}", e.getMessage());
                }
            }

            String password = generatePassword(length, useLetters, useNumbers, useSpecialChars);
            System.out.println("Generated Password: " + password);
        } catch (Exception e) {
            logger.error("Unexpected error: {}", e.getMessage());
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
