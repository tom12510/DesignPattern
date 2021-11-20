package org.example.Interpreter;

import java.util.Map;

/**
 * 加法解释器
 */
public class AddExpression extends SymbolExpression{

    /**
     * 构造变量  表示运算符左边 和右边 变量解释器
     *
     * @param left
     * @param right
     */
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
