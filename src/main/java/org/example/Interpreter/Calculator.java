package org.example.Interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * 解析器封装类
 */
public class Calculator {
    //定义表达式
    private Expression expression;

    public Calculator(String expStr) {

        Stack<Expression> stack = new Stack<>();
        char[] charArray = expStr.toCharArray();
        //运算
        Expression left = null;
        Expression rigth = null;
        // 后缀表达式运算
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    rigth = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, rigth));
                    break;
                case '-':
                    left = stack.pop();
                    rigth=new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,rigth));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }

        this.expression = stack.pop();
    }

    //开始运算
    public int run(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
