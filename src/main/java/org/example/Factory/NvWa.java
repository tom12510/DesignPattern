package org.example.Factory;

public class NvWa {
    public static void main(String[] args) {
        // 声明创造类实体
        AbstractHumanFactory humanFactory = new HumanFactory();

        WhiteHuman WhiteHuman = humanFactory.createHuman(WhiteHuman.class);

        BlackHuman BlackHuman = humanFactory.createHuman(BlackHuman.class);

        YellowHum human = humanFactory.createHuman(YellowHum.class);


    }
}
