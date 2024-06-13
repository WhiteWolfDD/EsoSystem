package com.ecosystem.controllers;

import com.ecosystem.models.AnimalModel;
import com.ecosystem.models.AnimalType;
import com.ecosystem.models.Habitat;
import com.ecosystem.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * AbstractAnimal class
 * This class is responsible for providing the basic functionalities of an animal
 */
public abstract class AbstractAnimal implements AnimalModel {
    protected String name;
    protected AnimalType type;
    protected List<Habitat> habitats;
    protected double minSpeed;
    protected double maxSpeed;
    protected double minSize;
    protected double maxSize;

    protected final List<Observer> observers;
    private int animalCount;

    // Constructor
    public AbstractAnimal() {
        observers = new ArrayList<>();
    }

    // Getters and setters
    @Override
    public int getAnimalCount() {
        return animalCount;
    }

    @Override
    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
        notifyObservers();
    }

    // Observer methods
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    // AnimalModel methods
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public AnimalType getType() {
        return this.type;
    }

    @Override
    public List<Habitat> getHabitats() {
        return this.habitats;
    }

    @Override
    public double getSpeed() {
        return rnd.nextDouble(minSpeed, maxSpeed);
    }

    @Override
    public double getSize() {
        return rnd.nextDouble(minSize, maxSize);
    }

    // Abstract methods
    @Override
    public void eat(AbstractAnimal predator, AbstractAnimal prey) {
        if (predator.getSpeed() > prey.getSpeed() && predator.getSize() > prey.getSize()) {
            System.out.println(predator.getName() + " is hunting " + prey.getName());
            System.out.println(prey.getAnimalCount() + " " + prey.getName() + "s left.");
            prey.setAnimalCount(prey.getAnimalCount() - rnd.nextInt(1, 10));
            System.out.println(prey.getAnimalCount() + " " + prey.getName() + "s left.");
        } else {
            System.out.println(predator.getName() + " cannot hunt " + prey.getName());
        }
    }

    @Override
    public void reproduce() {
        System.out.println("Reproducing...");
        int oldCount = getAnimalCount();
        setAnimalCount(Math.max(getAnimalCount() + rnd.nextInt(1, 40), 0));
        int born = getAnimalCount() - oldCount;
        System.out.println(born + " " + getName() + "s were born.");
    }

    @Override
    public void interact(AnimalModel other) {
        if (this.getHabitats().stream().anyMatch(other.getHabitats()::contains)) {
            System.out.println(this.getName() + " and " + other.getName() + " are interacting.");
            if (this.getName().equals(other.getName())) {
                this.reproduce();
            } else {
                this.eat(this, (AbstractAnimal) other);
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(this.getName() + " and " + other.getName() + " are not interacting.");
        }
    }
}
