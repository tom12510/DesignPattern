package org.example.State;


/**
 * 抽象状态
 */
public abstract class LiftState {
    protected Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void stop();
}
