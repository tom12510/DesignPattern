package org.example.State;

public class ClosingState extends LiftState{

    @Override
    public void open() {
        super.context.setLiftStatel(Context.openningState);
        super.context.getLiftStatel().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {

    }
}
