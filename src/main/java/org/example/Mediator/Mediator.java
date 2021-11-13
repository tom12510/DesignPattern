package org.example.Mediator;

/**
 * 通用抽象中介者
 */
public abstract class Mediator {
    //定义通信对象
    protected ConcreteColleague1 c1;

    protected ConcteteColleague2 c2;

    public ConcreteColleague1 getC1() {
        return c1;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public ConcteteColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcteteColleague2 c2) {
        this.c2 = c2;
    }

    public abstract void doSomething1();

    public abstract void doSomething2();
}
