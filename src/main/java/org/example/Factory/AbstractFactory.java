package org.example.Factory;

/**
 * 抽象工厂类 为 Color 和 Shape 系列对象约束
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
