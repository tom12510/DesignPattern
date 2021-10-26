package org.example.AbstractFactory;

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
