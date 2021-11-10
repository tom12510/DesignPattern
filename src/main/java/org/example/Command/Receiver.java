package org.example.Command;

/**
 * 接受者角色
 * 角色就是干活的角色，命令传递到这里是应该被执行
 */
public abstract class Receiver {
    //抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
