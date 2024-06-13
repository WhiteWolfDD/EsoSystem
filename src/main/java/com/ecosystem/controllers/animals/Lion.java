package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Lion extends AbstractAnimal {
    public Lion() {
        this.name = "Lion";
        this.type = AnimalType.CARNIVORE;
        this.habitats = Arrays.asList(Habitat.GRASSLAND, Habitat.DESERT);
        this.minSpeed = 50;
        this.maxSpeed = 74;
        this.minSize = .8;
        this.maxSize = 1.2;
    }
}
