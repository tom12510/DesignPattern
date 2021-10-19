package org.example.AbstractFactory.Implement;

import org.example.AbstractFactory.Abstract.AbstractYellowHuman;

/**
 * 扩展实现类 使用继承方法实现(多态)
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("man MaleYellowHuman");
    }
}
