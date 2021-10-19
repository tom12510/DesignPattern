package org.example.Factory.Domain;

import org.example.Factory.Abstract.AbstractHumanFactory;
import org.example.Factory.Implement.BlackHuman;
import org.example.Factory.Implement.HumanFactory;
import org.example.Factory.Implement.WhiteHuman;
import org.example.Factory.Implement.YellowHum;

public class NvWa {
    public static void main(String[] args) {
        // 声明创造类实体
        AbstractHumanFactory humanFactory = new HumanFactory();

        WhiteHuman WhiteHuman = humanFactory.createHuman(WhiteHuman.class);

        BlackHuman BlackHuman = humanFactory.createHuman(BlackHuman.class);

        YellowHum human = humanFactory.createHuman(YellowHum.class);


    }
}
