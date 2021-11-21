package org.example.Bridge.Case1;

public class HouseCorp extends Corp {
    // 生产具体产品公司 House
    public HouseCorp(House product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("房产公司最挣钱!");
    }
}
