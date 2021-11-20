package org.example.Memento.Case2;

public class Originator implements Cloneable {
    private String state = "";

    private Originator backup;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento() {
        this.backup=this.clone();
    }

    public void restoreMemento() {
        this.setState(this.backup.getState());
    }

    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
