package org.example.Visitor.Case1;

/**
 * 访问者接口
 * 不同访问的对象执行不同逻辑
 */
public interface IVisitor {

    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
