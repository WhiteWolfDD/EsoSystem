package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Boar extends AbstractAnimal {
    public Boar() {
        this.name = "Boar";
        this.type = AnimalType.OMNIVORE;
        this.habitats = Arrays.asList(Habitat.FOREST, Habitat.GRASSLAND, Habitat.MOUNTAIN, Habitat.RAINFOREST);
        this.minSpeed = 20;
        this.maxSpeed = 40;
        this.minSize = 0.5;
        this.maxSize = 1.2;
    }
}
