package org.example.Strategy;

/**
 * 执行逻辑2
 */
public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("GivenGreenLight -> operate ");
    }
}
