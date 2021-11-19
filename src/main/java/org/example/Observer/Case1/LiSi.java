package org.example.Observer.Case1;

public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("context:" + context);
        this.report(context);
    }

    private void report(String context) {
        System.out.println("report:" + context);
    }
}
