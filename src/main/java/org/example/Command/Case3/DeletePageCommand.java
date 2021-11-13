package org.example.Command.Case3;

public class DeletePageCommand extends Command {
    @Override
    public void excute() {
        super.cg.find();
        super.rg.delete();
        super.rg.plan();
    }
}
