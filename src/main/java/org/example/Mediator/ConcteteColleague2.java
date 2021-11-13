package org.example.Mediator;

public class ConcteteColleague2 extends Colleague {
    public ConcteteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {
        //依赖于ConcteteColleague1 使用父类
        super.mediator.doSomething2();
        System.out.println("selfMethod2  ConcteteColleague2");
    }
}
