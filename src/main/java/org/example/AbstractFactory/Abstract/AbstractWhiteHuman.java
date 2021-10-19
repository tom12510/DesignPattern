package org.example.AbstractFactory.Abstract;

import org.example.AbstractFactory.Interface.Human;

public abstract class AbstractWhiteHuman implements Human {
    public void getColor() {
        System.out.println("AbstractWhiteHuman is Color While");
    }

    public void talk(){
        System.out.println("AbstractWhiteHuman~~~~");
    }
}
