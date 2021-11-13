package org.example.Command.Case3;

/**
 * 实现具体命令逻辑
 */
public class AddRequireMentCommand extends Command{

    @Override
    public void excute() {
        super.rg.add();
        super.rg.change();
        super.rg.plan();
    }
}
