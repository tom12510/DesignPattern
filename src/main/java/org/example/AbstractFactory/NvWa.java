package org.example.AbstractFactory;

public class NvWa {
    public static void main(String[] args) {
        FemaleFactory femaleFactory = new FemaleFactory();

        MaleFactory maleFactory = new MaleFactory();

        Human whiteHuman = femaleFactory.createWhiteHuman();

        Human yellowHuman = maleFactory.createWhiteHuman();
    }
}
