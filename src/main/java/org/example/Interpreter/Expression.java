package org.example.Interpreter;

import java.util.Map;

/**
 * 表达式抽象类
 */
public abstract class Expression {

    //映射参数与数值关系  eg:a+b+c  map=> a=10 b=20 c=30
    public abstract int interpreter(Map<String, Integer> var);
}
