package org.example.Factory.Implement;

import org.example.Factory.Interface.Human;

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
