package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Raccoon extends AbstractAnimal {
    public Raccoon() {
        this.name = "Raccoon";
        this.type = AnimalType.OMNIVORE;
        this.habitats = Arrays.asList(Habitat.FOREST, Habitat.WETLAND);
        this.minSpeed = 16;
        this.maxSpeed = 24;
        this.minSize = .65;
        this.maxSize = .8;
    }
}
