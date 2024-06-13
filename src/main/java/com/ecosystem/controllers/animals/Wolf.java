package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Wolf extends AbstractAnimal {
    public Wolf() {
        this.name = "Wolf";
        this.type = AnimalType.CARNIVORE;
        this.habitats = Arrays.asList(Habitat.FOREST, Habitat.GRASSLAND, Habitat.MOUNTAIN, Habitat.TUNDRA);
        this.minSpeed = 40;
        this.maxSpeed = 60;
        this.minSize = 1.05;
        this.maxSize = 1.6;
    }
}
