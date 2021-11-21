package org.example.Bridge.Case1;

/**
 *
 */
public abstract class Corp {
    //依赖
    private Product product;

    // 由Product 子类决定生产什么产品
    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }
}
