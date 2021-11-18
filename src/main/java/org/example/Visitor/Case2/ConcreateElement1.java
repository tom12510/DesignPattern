package org.example.Visitor.Case2;



public class ConcreateElement1 extends Element{
    @Override
    public void doSomething() {
        System.out.println("ConcreateElement1");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
