package org.example.Observer.Case2;

public class Client {
    public static void main(String[] args) {
        ConcreateSubject subject = new ConcreateSubject();
        ConcreateObserver obs = new ConcreateObserver();
        subject.addObserver(obs);
        subject.doSomeThing();
    }
}
