package org.example.Command.Case3;

/**
 * 抽象类命令 (定义命令约束)
 */
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup cg = new PageGroup();
    // 执行命令(逻辑)
    public abstract void excute();
}
