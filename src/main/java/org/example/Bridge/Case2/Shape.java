package org.example.Bridge.Case2;

/**
 * 抽象类依赖于其他接口进行扩展
 */
public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
