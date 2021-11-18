package org.example.Visitor.Case2;

import java.util.Random;

public class ObjectStruture {
    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreateElement1();
        } else {
            return new ConcreateElement2();
        }
    }

}
