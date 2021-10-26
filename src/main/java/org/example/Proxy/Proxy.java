package org.example.Proxy;

public class Proxy implements Subject {
    private Subject subject = null;

    // 多个构造方法
    public Proxy() {
        this.subject = new Proxy();
    }

    //通过构造方法把被代理类依赖进来
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before() {
        System.out.println("执行前逻辑处理");
    }

    private void after() {
        System.out.println("执行后逻辑处理");
    }
}
