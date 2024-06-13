package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Zebra extends AbstractAnimal {
    public Zebra() {
        this.name = "Zebra";
        this.type = AnimalType.HERBIVORE;
        this.habitats = Arrays.asList(Habitat.GRASSLAND, Habitat.DESERT);
        this.minSpeed = 34;
        this.maxSpeed = 65;
        this.minSize = 2.5;
        this.maxSize = 2.75;
    }
}
