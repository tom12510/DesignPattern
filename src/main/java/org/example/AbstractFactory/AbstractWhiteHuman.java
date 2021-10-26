package org.example.AbstractFactory;

public abstract class AbstractWhiteHuman implements Human {
    public void getColor() {
        System.out.println("AbstractWhiteHuman is Color While");
    }

    public void talk(){
        System.out.println("AbstractWhiteHuman~~~~");
    }
}
