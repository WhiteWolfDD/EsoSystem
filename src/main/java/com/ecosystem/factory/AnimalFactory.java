package com.ecosystem.factory;

import com.ecosystem.controllers.animals.*;
import com.ecosystem.models.AnimalModel;

/**
 * Factory class for creating animals
 */
public class AnimalFactory {
    public static AnimalModel createAnimal(String type) {
        return switch (type) {
            case "Bear" -> new Bear();
            case "Beaver" -> new Beaver();
            case "Boar" -> new Boar();
            case "Elephant" -> new Elephant();
            case "Fox" -> new Fox();
            case "Giraffe" -> new Giraffe();
            case "Hyena" -> new Hyena();
            case "Lion" -> new Lion();
            case "Lynx" -> new Lynx();
            case "Mouse" -> new Mouse();
            case "Raccoon" -> new Raccoon();
            case "Wolf" -> new Wolf();
            case "Zebra" -> new Zebra();
            default -> throw new IllegalArgumentException("Invalid animal type: " + type);
        };
    }
}
