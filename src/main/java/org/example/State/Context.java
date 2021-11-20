package org.example.State;

/**
 * 通信类
 */
public class Context {
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();
    private LiftState liftStatel;

    public LiftState getLiftStatel() {
        return liftStatel;
    }

    public void setLiftStatel(LiftState liftStatel) {
        this.liftStatel = liftStatel;
        this.liftStatel.setContext(this);
    }
}
