package org.example.Interpreter;

/**
 * 抽象运算符号解释器
 */
public abstract class SymbolExpression extends Expression{

    protected Expression left;

    protected Expression right;

    /**
     * 构造变量  表示运算符左边 和右边 变量解释器
     * @param left
     * @param right
     */
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
