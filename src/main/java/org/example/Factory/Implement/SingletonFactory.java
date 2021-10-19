package org.example.Factory.Implement;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {

        try {
            Class<?> aClass = Class.forName(Singleton.class.getName());
            // 获取无参构造
            Constructor declaredConstructor = aClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            // 创建实例
            singleton = (Singleton) declaredConstructor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static Singleton getSingleton() {
        return singleton;
    }
}
