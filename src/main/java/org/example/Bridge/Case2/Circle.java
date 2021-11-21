package org.example.Bridge.Case2;

public class Circle extends Shape {

    private int x, y, radius;


    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.drawApi.drawCircle(radius, x, y);
    }
}
