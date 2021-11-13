package org.example.Command.Case3;

/**
 * 具体类实现行为类
 */
public class RequirementGroup extends Group{
    @Override
    public void find() {
        System.out.println("RequirementGroup--find()");
    }

    @Override
    public void add() {
        System.out.println("RequirementGroup --add()");
    }

    @Override
    public void delete() {
        System.out.println("RequirementGroup-delete");
    }

    @Override
    public void change() {
        System.out.println("RequirementGroup -- change");
    }

    @Override
    public void plan() {
        System.out.println("RequirementGroup --plan");
    }
}
