package org.example.Builder.Case2;

/**
 * 具体建造者
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 21f;
    }
}
