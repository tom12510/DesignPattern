package org.example.Command.Case2;

/**
 * 请求类  封装所有的命令
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void busy() {
        System.out.println("Stock [name]:" + name);
    }

    public void shell() {
        System.out.println("---- shell" + quantity);
    }
}
