package org.example.Builder.Case2;

/**
 * 商品 单继承部分行为
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 204f;
    }
}
