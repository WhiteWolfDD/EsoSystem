package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Elephant extends AbstractAnimal {
    public Elephant() {
        this.name = "Elephant";
        this.type = AnimalType.HERBIVORE;
        this.habitats = Arrays.asList(Habitat.FOREST, Habitat.GRASSLAND, Habitat.MOUNTAIN, Habitat.RAINFOREST, Habitat.DESERT);
        this.minSpeed = 2;
        this.maxSpeed = 40;
        this.minSize = 6;
        this.maxSize = 7.5;
    }
}
