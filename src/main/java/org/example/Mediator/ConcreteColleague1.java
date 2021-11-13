package org.example.Mediator;

public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        System.out.println("selfMethod1 ConcreteColleague1");
        //依赖于ConcteteColleague2对象使用中介者完成
        super.mediator.doSomething1();
    }
}
