package org.example.Memento.Case1;

/**
 * 备份对象 state 备份数据
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
