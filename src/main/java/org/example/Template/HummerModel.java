package org.example.Template;

public abstract class HummerModel {
    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    //模版方法 相同的代码已抽取 不允许重写
    public final void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
    // 钩子方法 影响run逻辑
    protected boolean isAlarm() {
        return true;
    }


}
