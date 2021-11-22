package org.example.Template;

public abstract class Game {
    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();

    //模板  逻辑行为
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

}
