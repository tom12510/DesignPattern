package org.example.Proxy.domain;

import org.example.Proxy.Implements.GamePlayer;
import org.example.Proxy.Implements.GamePlayerProxy;
import org.example.Proxy.Implements.Proxy;
import org.example.Proxy.Implements.RealSubject;
import org.example.Proxy.Inerface.IGamePlayer;
import org.example.Proxy.dynamic.GamePlayIH;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;

public class Client {
    @Test
    public void testProxy() {
        //普通静态代理(依赖方式实现)
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }

    @Test
    public void testFixProxy() {
        //栈溢出  FIXME
        Proxy proxy = new Proxy();
        proxy.request();
    }

    @Test
    public void forceProxy() {
        // 强制代理(通过被代理类找到代理类)  被代理人miaimiaole请狂徒张三代理
        IGamePlayer igameplayer = new GamePlayer("miaimiaole");
        IGamePlayer proxy = igameplayer.getProxy();
        proxy.login("狂徒张三", "134565");
        proxy.killBoss();
        proxy.upgrade();
    }

    @Test
    public void forceProxy_1() {
        // 强制代理(直接访问代理角色) 无法代理
        IGamePlayer iGamePlayer = new GamePlayer("张三");
        GamePlayerProxy proxy = new GamePlayerProxy(iGamePlayer);
        proxy.login("12344", "1234");
        proxy.killBoss();
        proxy.upgrade();
    }

    //动态代理实现
    @Test
    public void dynamicProxy() {
        // 被代理类
        IGamePlayer player = new GamePlayer("张三");
        //代理类
        InvocationHandler gamePlayIH = new GamePlayIH(player);
        ClassLoader classLoader = player.getClass().getClassLoader();
        /**
         * loader 被代理类加载器
         * class 代理类class
         * 加强类逻辑
         */
        IGamePlayer o1 = (IGamePlayer) java.lang.reflect.Proxy.newProxyInstance(classLoader,
                new Class[]{IGamePlayer.class}, gamePlayIH);
        o1.login("124", "1234");
        System.out.println(o1);
    }

}
