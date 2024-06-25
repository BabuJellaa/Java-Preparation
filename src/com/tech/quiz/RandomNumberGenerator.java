package com.tech.quiz;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate and print a random integer

        // Generate and print a random integer within a specific range
        int minRange = 1;
        int maxRange = 100;

        // Generate and print a random double
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);
    }
}