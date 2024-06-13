package com.ecosystem;

import com.ecosystem.controllers.TableDisplay;
import com.ecosystem.factory.AnimalFactory;
import com.ecosystem.models.AnimalModel;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        // Create a list of animals
        List<AnimalModel> animals = Arrays.asList(
                AnimalFactory.createAnimal("Bear"),
                AnimalFactory.createAnimal("Beaver"),
                AnimalFactory.createAnimal("Boar"),
                AnimalFactory.createAnimal("Elephant"),
                AnimalFactory.createAnimal("Fox"),
                AnimalFactory.createAnimal("Giraffe"),
                AnimalFactory.createAnimal("Hyena"),
                AnimalFactory.createAnimal("Lion"),
                AnimalFactory.createAnimal("Lynx"),
                AnimalFactory.createAnimal("Raccoon"),
                AnimalFactory.createAnimal("Wolf"),
                AnimalFactory.createAnimal("Zebra"),
                AnimalFactory.createAnimal("Mouse")
        );

        // Set initial animal count
        animals.forEach(animal -> animal.setAnimalCount(10));

        // Create table display
        TableDisplay tableDisplay = new TableDisplay(animals);

        // Register table display as observer
        for (AnimalModel animal : animals) {
            animal.registerObserver(tableDisplay);
        }

        // Update animal count every 1 seconds
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() -> {

            // Interact with random animals
            int firstAnimalIndex = AnimalModel.rnd.nextInt(animals.size());
            int secondAnimalIndex = AnimalModel.rnd.nextInt(animals.size());
            animals.get(firstAnimalIndex).interact(animals.get(secondAnimalIndex));

            // Animal count changes
            for (AnimalModel animal : animals) {
                animal.setAnimalCount(animal.getAnimalCount());

                // Exit if animal count reaches 100
                if (animal.getAnimalCount() > 100) {
                    System.out.println("Animal " + animal.getName() + " has reached a population of 100. Exiting...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    executor.shutdown();
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
}