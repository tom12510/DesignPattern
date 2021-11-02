package org.example.Bridge;

public class ShanZhaiCorp extends Corp {

    // 任何商品都可以生产
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司生产正规商品!!!");
    }
}
