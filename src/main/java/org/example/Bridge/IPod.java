package org.example.Bridge;

public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这样的... beProducted");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了... beSelled");
    }
}
