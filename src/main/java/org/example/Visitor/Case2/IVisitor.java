package org.example.Visitor.Case2;

/**
 * 定义访问者
 */
public interface IVisitor {
    void visit(ConcreateElement2 element);
    void visit(ConcreateElement1 element);
}
