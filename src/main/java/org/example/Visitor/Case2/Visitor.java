package org.example.Visitor.Case2;

public class Visitor implements IVisitor {
    @Override
    public void visit(ConcreateElement2 element) {
        element.doSomething();
    }

    @Override
    public void visit(ConcreateElement1 element) {
        element.doSomething();
    }
}
