package org.example.Adapter.Case;

public class Adapter extends Adaptee implements Target {
    //优先使用父类方法
    @Override
    public void request() {
        super.doSomeThing();
    }
}
