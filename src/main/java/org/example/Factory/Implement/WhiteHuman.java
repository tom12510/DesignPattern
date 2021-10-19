package org.example.Factory.Implement;

import org.example.Factory.Interface.Human;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白皮猪");
    }

    @Override
    public void talk() {
        System.out.println("白皮猪说英语");
    }
}
