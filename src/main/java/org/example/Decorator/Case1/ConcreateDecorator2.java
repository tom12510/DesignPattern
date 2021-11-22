package org.example.Decorator.Case1;

/**
 * 具体装饰类2
 */
public  class ConcreateDecorator2 extends Decorator{

    public ConcreateDecorator2(Component component) {
        super(component);
    }
    // 委托给被修饰者执行
    @Override
    public void operate() {
       super.operate();
       this.method2();
    }
     // 装饰者方法
    protected  void method2(){
        System.out.println("method2");
    };
}
