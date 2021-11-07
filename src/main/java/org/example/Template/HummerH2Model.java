package org.example.Template;

public class HummerH2Model extends HummerModel {

    private boolean alarmFlag = true;

    @Override
    public void start() {
        System.out.println("悍马H2发动...");

    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }

    // 重写 钩子方法(客户端决定模版执行逻辑)
    protected boolean isAlarm() {
        return this.alarmFlag;
    }
    // 钩子方法(客户端决定模版执行逻辑)
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }

    // 相同的代码逻辑需要抽取
   /* @Override
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }*/
}
