package org.example.Factory;

/**
 * 具体产品
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw Circle");
    }
}
