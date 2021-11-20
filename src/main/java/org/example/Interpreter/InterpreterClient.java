package org.example.Interpreter;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class InterpreterClient {
    @Test
    public void testCase1() {
        String expStr = "a+b-c";
        Map<String, Integer> var = new HashMap();
        var.put("a",10);
        var.put("b",10);
        var.put("c",10);

        Calculator calculator = new Calculator(expStr);

        System.out.println(calculator.run(var));

    }
}
