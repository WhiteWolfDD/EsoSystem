package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;
import com.ecosystem.observer.Observer;

import java.util.Arrays;

public class Bear extends AbstractAnimal {
    public Bear(){
        this.name = "Bear";
        this.type = AnimalType.OMNIVORE;
        this.habitats = Arrays.asList(Habitat.FOREST, Habitat.MOUNTAIN, Habitat.TUNDRA, Habitat.WETLAND);
        this.minSpeed = 34;
        this.maxSpeed = 60;
        this.minSize = 1.2;
        this.maxSize = 2.8;
    }
}
