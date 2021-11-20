package org.example.State;

public class OpenningState extends LiftState{
    @Override
    public void open() {
        System.out.println("open --> OpenningState");
    }

    @Override
    public void close() {
    super.context.setLiftStatel(Context.closingState);
    super.context.getLiftStatel().close();
    }

    @Override
    public void stop() {
        System.out.println("stop -> OpenningState");
    }
}
