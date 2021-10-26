package org.example.Proxy;

/**
 * 强制代理类(通过真实类访问代理类)
 */
public interface IGamePlayer {
    void login(String user, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();
}
