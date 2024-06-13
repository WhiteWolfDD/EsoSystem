package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Lynx extends AbstractAnimal {
    public Lynx() {
        this.name = "Lynx";
        this.type = AnimalType.CARNIVORE;
        this.habitats = Arrays.asList(Habitat.FOREST, Habitat.MOUNTAIN, Habitat.TUNDRA);
        this.minSpeed = 10;
        this.maxSpeed = 40;
        this.minSize = .8;
        this.maxSize = 1.3;
    }
}
