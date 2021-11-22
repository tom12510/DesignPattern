package org.example.Decorator.Case2;

/**
 * 装饰者 1 装饰具体内容
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    /**
     * 装饰逻辑
     */
    @Override
    public void draw() {
        super.decoratedShape.draw();
        System.out.println("red Color");
    }

}
