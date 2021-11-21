package org.example.Bridge.Case1;

/**
 * 具体产品类  满足 生产销售两个功能
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("beProducteding 中 生产出的房子是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产的房子卖出去了...");
    }
}
