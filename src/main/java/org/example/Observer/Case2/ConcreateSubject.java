package org.example.Observer.Case2;

/**
 * 具体被观察者
 */
public class ConcreateSubject extends Subject {
    public void doSomeThing() {
        System.out.println("执行之前");
        super.notifyObservers();
        System.out.println("执行之后");
    }
}
