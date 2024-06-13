package com.ecosystem.controllers;

import com.ecosystem.models.AnimalModel;

import java.util.Random;

/**
 * Class for simulating the lifecycle of an animal
 * <p>
 * This class is responsible for simulating the reproduction and death of animals
 * But not implemented in the project
 * If you want to use this class, you need to implement it in the project
 */
public class AnimalLifecycle {
    private final String name;
    private int animalCount;
    private final Random rnd;

    public AnimalLifecycle(AnimalModel animal, int initialCount) {
        this.name = animal.getName();
        this.animalCount = initialCount;
        this.rnd = new Random();
    }

    public int reproduceAndDie(int years, double deathProbability) {
        int carryingCapacity = 10000; // Maximum number of animals the environment can support
        Random normalDistribution = new Random();

        for (int i = 0; i < years; i++) {
            // Reproduction
            int animalsReproduced = rnd.nextInt(1, 5) + animalCount;
            animalCount += animalsReproduced;

            // Ensure animalCount does not exceed carryingCapacity
            if (animalCount > carryingCapacity) {
                animalCount = carryingCapacity;
            }

            // Natural death with normal distribution
            double variationFactor = 0.1; // 10% вариации
            double adjustedDeathProbability = deathProbability + normalDistribution.nextGaussian() * variationFactor * deathProbability;
            if (adjustedDeathProbability < 0) {
                adjustedDeathProbability = 0;
            } else if (adjustedDeathProbability > 1) {
                adjustedDeathProbability = 1;
            }

            int deaths = (int) (animalCount * adjustedDeathProbability);
            animalCount -= deaths;

            // Ensure animalCount is not negative
            if (animalCount < 0) {
                animalCount = 0;
            }

            // Print the yearly result for debugging purposes
            System.out.println("Year " + (i + 1) + ": " + animalsReproduced + " " + name + "s were born, " + deaths + " " + name + "s died. Total " + name + "s: " + animalCount);
        }

        System.out.println("After " + years + " years, there are " + animalCount + " " + name + "s left.");

        return animalCount;
    }
}
