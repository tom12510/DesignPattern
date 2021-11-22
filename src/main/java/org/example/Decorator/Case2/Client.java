package org.example.Decorator.Case2;

import org.junit.Test;

public class Client {
    @Test
    public void testDecorator() {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
    }
}
