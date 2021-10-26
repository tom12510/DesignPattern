package org.example.Factory;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("I`M Black");
    }

    @Override
    public void talk() {
        System.out.println("BlackMan talk some things");
    }
}
