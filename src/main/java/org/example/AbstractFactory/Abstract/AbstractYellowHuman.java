package org.example.AbstractFactory.Abstract;

import org.example.AbstractFactory.Interface.Human;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("AbstractYellowHuman ~~~~~ yellow");
    }

    @Override
    public void talk() {
        System.out.println("talk AbstractYellowHuman ~~~~ yellow");
    }
}
