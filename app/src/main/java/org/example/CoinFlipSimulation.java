package org.example;

import java.util.Random;

public class CoinFlipSimulation {
    public static void main(String[] args) {
        // Configuration
        int numberOfTrials = 10; // Total number of trials
        int numberOfFlipsPerTrial = 500; // Flips per trial
        double probabilityOfHeads = .75; // Probability of heads

        // Random number generator
        Random random = new Random();

        // CSV Header
        System.out.println("Flips Per Trial,Trial Number,Probability of Heads,Heads Count");

        // Simulation loop
        for (int trial = 1; trial <= numberOfTrials; trial++) {
            int headsCount = 0;

            for (int flip = 0; flip < numberOfFlipsPerTrial; flip++) {
                if (random.nextDouble() < probabilityOfHeads) {
                    headsCount++;
                }
            }

            // CSV Output
            System.out.printf("%d,%d,%.2f,%d%n",
                    numberOfFlipsPerTrial, trial, probabilityOfHeads, headsCount);
        }
    }
}
