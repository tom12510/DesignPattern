package org.example.Observer.Case1;

/**
 * 观察者
 */
public class WangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("当前改变的值:" + context);
        this.cry(context);
    }

    private void cry(String context) {
        System.out.println(context + "   cry");
    }
}
