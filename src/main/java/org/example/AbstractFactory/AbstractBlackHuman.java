package org.example.AbstractFactory;

public abstract class AbstractBlackHuman implements Human {
    public void getColor(){
        System.out.println("Black !~~~~");
    }

    @Override
    public void talk() {
        System.out.println("Black is Talk");
    }
}
