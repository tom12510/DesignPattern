package org.example.Observer.Case1;


/**
 * 被观察者接口 约束被观察者对象
 */
public interface Observable {
    void addObserver(Observer observable);

    void deleteObserver(Observer observable);

    //通知观察者 被观察对象已发生改变
    void notifyObserver(String context);

}
