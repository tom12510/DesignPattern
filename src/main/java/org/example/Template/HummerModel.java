package org.example.Template;

public abstract class HummerModel {
    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    //相同的代码已抽取 不允许重写
    public final void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }

}
