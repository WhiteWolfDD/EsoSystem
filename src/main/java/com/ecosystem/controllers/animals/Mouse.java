package com.ecosystem.controllers.animals;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;

import java.util.Arrays;

public class Mouse extends AbstractAnimal {
    public Mouse() {
        this.name = "Mouse";
        this.type = AnimalType.HERBIVORE;
        this.habitats = Arrays.asList(Habitat.FOREST, Habitat.WETLAND, Habitat.GRASSLAND, Habitat.MOUNTAIN, Habitat.TUNDRA, Habitat.DESERT);
        this.minSpeed = 2;
        this.maxSpeed = 15;
        this.minSize = 0.06;
        this.maxSize = 0.24;
    }
}

