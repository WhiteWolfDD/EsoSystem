package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Beaver extends AbstractAnimal {
    public Beaver() {
        this.name = "Beaver";
        this.type = AnimalType.HERBIVORE;
        this.habitats = Arrays.asList(Habitat.FRESHWATER, Habitat.FOREST, Habitat.WETLAND);
        this.minSpeed = 2;
        this.maxSpeed = 10;
        this.minSize = 0.5;
        this.maxSize = 1.3;
    }
}
