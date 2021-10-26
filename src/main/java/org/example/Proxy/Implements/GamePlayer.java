package org.example.Proxy.Implements;

import org.example.Proxy.Inerface.IGamePlayer;

/**
 * 强代理的真实角色
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";


    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    //依赖代理类(IGamePlayer接口实现类)
    @Override
    public IGamePlayer getProxy() {
        //强代理
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("user:" + user + "登录成功");
        } else {
            System.out.println("使用指定代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println("killBoss中");
        } else {
            System.out.println("使用指定代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println("upgrade中");
        } else {
            System.out.println("使用指定代理访问");
        }
    }

    private boolean isProxy() {
        return this.proxy == null ? false : true;
    }
}
