package com.ecosystem;

import com.ecosystem.factory.AnimalFactory;
import com.ecosystem.models.AnimalModel;
import com.ecosystem.models.Habitat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * Test class for the Animal activities.
 */
public class ActivityTest {
    private List<AnimalModel> animals;

    /**
     * Set up the animals for testing.
     */
    @BeforeEach
    public void setUp() {
        animals = Arrays.asList(
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
    }

    List<Habitat> habitats = Arrays.stream(Habitat.values()).toList();

    /**
     * Test if animals can interact with each other.
     * This test will randomly select two animals and make them interact.
     */
    @Test
    public void AnimalsCanInteract() {
        AnimalModel predator = animals.get(new Random().nextInt(animals.size()));
        AnimalModel prey = animals.get(new Random().nextInt(animals.size()));

        System.out.printf("%s is interacting with %s\n", predator.getName(), prey.getName());

        predator.interact(prey);
    }

    /**
     * Test if animals can eat each other.
     * This test will randomly select two animals and make one eat the other.
     */
    @Test
    public void AnimalsHaveMultipleHabitat() {
        for (AnimalModel animal : animals) {
            System.out.printf("Animal name: %s | Animal habitats: %s\n", animal.getName(), animal.getHabitats());
        }
    }

    /**
     * Test habitat of animals.
     * This test will list all animals that live in a specific habitat.
     */
    @Test
    public void AnimalsFromHabitat() {
        for (Habitat habitat : habitats) {
            System.out.printf("Habitat: %s\n", habitat);
            List<String> animalsInHabitat = new ArrayList<>();
            for (AnimalModel animal : animals) {
                if (animal.getHabitats().contains(habitat)) {
                    animalsInHabitat.add(animal.getName());
                }
            }
            if (animalsInHabitat.isEmpty()) {
                System.out.println("No one lives here...\n");
            } else {
                System.out.printf("Animals in this habitat: %s\n\n", String.join(", ", animalsInHabitat));
            }
        }
    }

    /**
     * Test if animals can reproduce.
     * This test will make all animals reproduce.
     */
    @Test
    public void AnimalsCanReproduce() {
        for (AnimalModel animal : animals) {
            animal.reproduce();
        }
    }
}