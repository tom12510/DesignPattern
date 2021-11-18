package org.example.Visitor.Case2;


/**
 * 被访问对象 抽象约束
 */
public abstract class Element {
    /**
     * 对象逻辑
     */
    public abstract void doSomething();

    /**
     * 访问者执行逻辑
     *
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);
}
