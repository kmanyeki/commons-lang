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


import java.util.Scanner;

public class PasswordGenerator {

    // Method to generate random passwords
    public static String generatePassword(int length, boolean useLetters, boolean useNumbers) {
        Validate.inclusiveBetween(8, 20, length, "Password length must be between 8 and 20 characters.");
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    // Method to validate user input
    public static boolean validatePassword(String password) {
        return StringUtils.isNotBlank(password) && password.length() >= 8 && password.length() <= 20;
    }

    // Main method: interactive CLI
    public static void main(String[] args) {
        System.out.println("Welcome to the Password Generator App!");
        Scanner scanner = new Scanner(System.in);

        // User input for password criteria
        System.out.println("Enter desired password length (8-20): ");
        int length = scanner.nextInt();
        System.out.println("Include letters? (true/false): ");
        boolean useLetters = scanner.nextBoolean();
        System.out.println("Include numbers? (true/false): ");
        boolean useNumbers = scanner.nextBoolean();

        // Generate and display password
        String password = generatePassword(length, useLetters, useNumbers);
        System.out.println("Generated Password: " + password);

        // Validation check
        System.out.println("Validating password...");
        if (validatePassword(password)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid!");
        }

        scanner.close();
    }
}
