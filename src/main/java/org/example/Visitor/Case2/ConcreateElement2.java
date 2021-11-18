package org.example.Visitor.Case2;

public class ConcreateElement2 extends Element{

    @Override
    public void doSomething() {
        System.out.println("ConcreateElement2");
    }

    @Override
    public void accept(IVisitor visitor) {
         visitor.visit(this);
    }
}
