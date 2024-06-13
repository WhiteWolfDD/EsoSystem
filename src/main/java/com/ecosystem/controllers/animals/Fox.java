package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Fox extends AbstractAnimal {
    public Fox() {
        this.name = "Fox";
        this.type = AnimalType.OMNIVORE;
        this.habitats = Arrays.asList(Habitat.FOREST, Habitat.GRASSLAND, Habitat.DESERT, Habitat.MOUNTAIN, Habitat.TUNDRA);
        this.minSpeed = 25;
        this.maxSpeed = 50;
        this.minSize = .6;
        this.maxSize = .9;
    }
}
