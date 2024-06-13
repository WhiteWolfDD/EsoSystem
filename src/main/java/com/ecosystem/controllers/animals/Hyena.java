package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Hyena extends AbstractAnimal {
    public Hyena() {
        this.name = "Hyena";
        this.type = AnimalType.CARNIVORE;
        this.habitats = Arrays.asList(Habitat.GRASSLAND, Habitat.DESERT);
        this.minSpeed = 40;
        this.maxSpeed = 64;
        this.minSize = .7;
        this.maxSize = .9;
    }
}
