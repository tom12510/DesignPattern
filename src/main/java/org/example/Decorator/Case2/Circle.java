package org.example.Decorator.Case2;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle 被装饰者2");
    }
}
