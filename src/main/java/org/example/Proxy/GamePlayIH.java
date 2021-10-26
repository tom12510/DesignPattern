package org.example.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 非代理类  AOP编入逻辑
 */
public class GamePlayIH implements InvocationHandler {

    //被代理者
    Class cls = null;
    Object obj = null;

    //被代理类依赖关联  Object(被代理类)
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    /**
     * 对被代理类方法调用
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
