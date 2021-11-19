package org.example.Strategy;

/**
 * 执行逻辑1
 */
public class BackDoor implements IStrategy{
    @Override
    public void operate() {
        System.out.println("BackDoor open the door");
    }
}
