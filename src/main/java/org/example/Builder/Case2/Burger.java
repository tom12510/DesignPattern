package org.example.Builder.Case2;

/**
 * 抽象建造者
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
