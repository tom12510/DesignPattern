package org.example.Factory;

public class YellowHum implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说汉字");
    }
}
