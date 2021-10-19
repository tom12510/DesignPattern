package org.example.AbstractFactory.Implement;

import org.example.AbstractFactory.Abstract.AbstractYellowHuman;

/**
 * 扩展实现类
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("yellow woman");
    }
}
