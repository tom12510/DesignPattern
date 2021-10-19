package org.example.AbstractFactory.Implement;

import org.example.AbstractFactory.Abstract.AbstractBlackHuman;
import org.example.AbstractFactory.Abstract.AbstractWhiteHuman;
import org.example.AbstractFactory.Interface.Human;
import org.example.AbstractFactory.Interface.HumanFactory;

/**
 * 具体实现工厂类
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new AbstractWhiteHuman() {
            @Override
            public void getSex() {
                System.out.println("is White WhiteHuman");
            }
        };
    }

    @Override
    public Human createBlackHuman() {
        return new AbstractBlackHuman() {
            @Override
            public void getSex() {
                System.out.println("is Black BlackHuman");
            }
        };
    }
}
