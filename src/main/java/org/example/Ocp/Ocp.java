package org.example.Ocp;

/**
 * 抽象类
 * 使用 抽象方法/接口约束功能
 */
abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Triangle extends Shape {


    @Override
    public void draw() {
        System.out.println("h绘制三角形");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

/**
 * 使用多态调用具体实现子类(不用修改原有代码逻辑)
 *
 * 使用方依赖抽象方法实现功能
 *
 * 实现开闭原则
 */
class GraphicEditor {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

public class Ocp{
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Circle());
    }
}

