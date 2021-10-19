package org.example.AbstractFactory.Domain;

import org.example.AbstractFactory.Implement.FemaleFactory;
import org.example.AbstractFactory.Implement.MaleFactory;
import org.example.AbstractFactory.Interface.Human;

public class NvWa {
    public static void main(String[] args) {
        FemaleFactory femaleFactory = new FemaleFactory();

        MaleFactory maleFactory = new MaleFactory();

        Human whiteHuman = femaleFactory.createWhiteHuman();

        Human yellowHuman = maleFactory.createWhiteHuman();
    }
}
