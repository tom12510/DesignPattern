package org.example.AbstractFactory;

import org.example.AbstractFactory.AbstractYellowHuman;

/**
 * 扩展实现类 使用继承方法实现(多态)
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("man MaleYellowHuman");
    }
}
