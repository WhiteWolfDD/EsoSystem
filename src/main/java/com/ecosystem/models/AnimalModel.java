package com.ecosystem.models;

import com.ecosystem.controllers.AbstractAnimal;
import com.ecosystem.observer.Subject;

import java.util.List;
import java.util.Random;

/**
 * Interface for AnimalModel
 */
public interface AnimalModel extends Subject {
    Random rnd = new Random();

    String getName();
    AnimalType getType();
    List<Habitat> getHabitats();
    double getSpeed();
    double getSize();
    void eat(AbstractAnimal predator, AbstractAnimal prey);
    void reproduce();
    void interact(AnimalModel other);

    int getAnimalCount();
    void setAnimalCount(int animalCount);
}

