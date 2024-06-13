package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Giraffe extends AbstractAnimal {
    public Giraffe() {
        this.name = "Giraffe";
        this.type = AnimalType.HERBIVORE;
        this.habitats = Arrays.asList(Habitat.GRASSLAND, Habitat.DESERT);
        this.minSpeed = 20;
        this.maxSpeed = 60;
        this.minSize = 5;
        this.maxSize = 6.1;
    }
}
