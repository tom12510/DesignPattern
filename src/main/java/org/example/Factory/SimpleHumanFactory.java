package org.example.Factory;

/**
 * 简单工厂类
 */
public class SimpleHumanFactory {
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;

        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) human;
    }
}
