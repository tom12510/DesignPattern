package org.example.Memento.Case1;

/**
 * 存储类(改变状态并能恢复原状)
 */
public class Boy {
    private String state ="";

    public void changeState(){
        this.state ="no";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //保留一个备份
    public Memento createMemento(){
        return new Memento(this.state);
    }
    //恢复备份
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
