package org.example.Command.Case1;

public class ConcreteCommand1 extends Command {
    //具体执行类
    private Receiver receiver;

    //构造方法传递接受者

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 执行命令
        this.receiver.doSomething();
    }
}
