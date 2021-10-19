package org.example.AbstractFactory.Interface;

/**
 * 工厂接口 实现各种Human扩展对象
 */
public interface HumanFactory {
    Human createYellowHuman();

    Human createWhiteHuman();

    Human createBlackHuman();
}
