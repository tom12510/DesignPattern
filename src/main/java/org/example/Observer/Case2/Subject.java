package org.example.Observer.Case2;

import java.util.Vector;

/**
 * 被观察者
 */
public abstract class Subject {
    private Vector<Observer> vector = new Vector<>();

    public void addObserver(Observer observer) {
        this.vector.add(observer);
    }

    public void delObserver(Observer observer) {
        this.vector.remove(observer);
    }

    /**
     * 通知所有的观察者
     */
    public void notifyObservers(){
        for (Observer observer : vector) {
            observer.update();
        }
    }
}
