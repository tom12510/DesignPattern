package org.example.Adapter.Case2;

/**
 * 对Target接口适成Adaptee
 */
public class Adapter extends Adaptee implements Target {
    // 使用原方法调用适配的接口
    @Override
    public void request() {
        super.doSomeThing();
    }
}
