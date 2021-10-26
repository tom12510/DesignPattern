package org.example.Proxy.Implements;

import org.example.Proxy.Inerface.IGamePlayer;

/**
 * 强制代理的代理类
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
