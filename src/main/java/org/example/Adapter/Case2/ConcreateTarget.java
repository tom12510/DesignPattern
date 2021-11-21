package org.example.Adapter.Case2;

/**
 * 目标实现类
 */
public class ConcreateTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help,pls call me ");
    }
}
