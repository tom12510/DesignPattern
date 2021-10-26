package org.example.AbstractFactory;

import org.example.AbstractFactory.AbstractYellowHuman;

/**
 * 扩展实现类
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("yellow woman");
    }
}
