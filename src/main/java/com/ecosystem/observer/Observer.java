package com.ecosystem.observer;

import com.ecosystem.models.AnimalModel;

/**
 * Observer interface
 */
public interface Observer {
    void update(AnimalModel animal);
}