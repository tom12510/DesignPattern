package org.example.AbstractFactory;

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
