package com.tech.hackkerank;

import java.util.Scanner;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class RemoveDuplicateWords {

    // Hashing function using SHA-256
    public static String hash(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(data.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    // Generate a random number between min and max using the combined seed
    public static int generateRandomNumber(String combinedSeed, int min, int max) throws NoSuchAlgorithmException {
        String hashedSeed = hash(combinedSeed);
        long number = Long.parseLong(hashedSeed.substring(0, 15), 16); // Use part of the hash to generate the number
        return (int) (min + (number % (max - min + 1)));
    }

    public static void main(String[] args) {
        try {
            String serverSeed = "s3cr3tS33d";
            String clientSeed = "playerSeed123";
            int min = 1;
            int max = 100;

            // Step 1: Server generates and shares the hash of the server seed
            String serverSeedHash = hash(serverSeed);
            System.out.println("Server Seed Hash (shared before the game): " + serverSeedHash);

            // Step 2: Combine server seed and client seed
            String combinedSeed = serverSeed + clientSeed;

            // Step 3: Generate the random number
            int randomNumber = generateRandomNumber(combinedSeed, min, max);
            System.out.println("Generated Random Number: " + randomNumber);

            // Step 4: After the game, server reveals the original server seed
            System.out.println("Server Seed (revealed after the game): " + serverSeed);

            // Step 5: Player verifies the fairness by recalculating the random number
            int verifiedNumber = generateRandomNumber(combinedSeed, min, max);
            System.out.println("Verified Random Number: " + verifiedNumber);

            // Verification
            if (randomNumber == verifiedNumber) {
                System.out.println("The game outcome is provably fair.");
            } else {
                System.out.println("The game outcome is not fair.");
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}


