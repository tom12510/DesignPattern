package org.example.AbstractFactory.Implement;

import org.example.AbstractFactory.Abstract.AbstractBlackHuman;
import org.example.AbstractFactory.Abstract.AbstractWhiteHuman;
import org.example.AbstractFactory.Interface.Human;
import org.example.AbstractFactory.Interface.HumanFactory;

public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new AbstractWhiteHuman() {
            @Override
            public void getSex() {
                System.out.println("WhiteHuman ~~~~");
            }
        };
    }

    @Override
    public Human createBlackHuman() {
        return new AbstractBlackHuman() {
            @Override
            public void getSex() {
                System.out.println("AbstractBlackHuman ~~~~");
            }
        };
    }
}
