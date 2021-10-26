package org.example.Decorator;

/**
 * 具体的装饰类
 */
public class ConcreateDecorator1 extends Decorator {

    public ConcreateDecorator1(Component component) {
        super(component);
    }

    //装饰者方法
    private void method1() {
        System.out.println("method1");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
