package com.ecosystem.controllers;

import com.ecosystem.models.AnimalModel;
import com.ecosystem.observer.Observer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

/**
 * TableDisplay class
 * This class is responsible for displaying the animal count in a table format
 */
public class TableDisplay implements Observer {
    private List<AnimalModel> animals;
    private final Map<String, Integer> lastAnimalCounts;

    /**
     * Constructor
     * @param animals List of animals
     */
    public TableDisplay(List<AnimalModel> animals) {
        this.animals = new ArrayList<>(animals);
        this.lastAnimalCounts = new HashMap<>();
        for (AnimalModel animal : animals) {
            lastAnimalCounts.put(animal.getName(), animal.getAnimalCount());
        }
        display();
    }

    /**
     * Update the list of animals
     * @param animals List of animals
     */
    public void updateAnimals(List<AnimalModel> animals) {
        this.animals = new ArrayList<>(animals);
        display();
    }

    /**
     * Update the animal count
     * @param animal AnimalModel
     */
    @Override
    public void update(AnimalModel animal) {
        lastAnimalCounts.put(animal.getName(), animal.getAnimalCount());
        display();
    }

    /**
     * Display the animal count in a table format
     */
    public void display() {
        clearConsole();
        System.out.println("Animal Name    | Animal Count");
        System.out.println("--------------------------------");
        for (AnimalModel animal : animals) {
            int currentCount = lastAnimalCounts.get(animal.getName());
            System.out.printf("%-14s | %-3d\n", animal.getName(), currentCount);
        }
    }

    /**
     * Clear the console
     * This method is used to clear the console before displaying the table each time
     */
    private void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
