package com.ecosystem.observer;

/**
 * Subject interface
 */
public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers();
}