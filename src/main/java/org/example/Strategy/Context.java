package org.example.Strategy;

/**
 * 承载策略容器
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略
     */
    public void operate(){
        this.strategy.operate();
    }
}
