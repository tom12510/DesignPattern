package org.example.Decorator.Case2;

/**
 * 被装饰者
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("被装饰者  Rectangle");
    }
}
