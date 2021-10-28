package org.example.Composite.Case;

import org.example.Composite.Case.Component;
import org.example.Composite.Case.Composite;
import org.example.Composite.Case.Left;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomeThing();

        Left left = new Left();
        // 添加根结点与叶子结点关系
        Composite branch = new Composite();
        root.add(branch);
        branch.add(left);
        display(root);
    }

    // 递归遍历
    public static void display(Composite root) {
        for (Component child : root.getChildren()) {
            if (child instanceof Left) {
                child.doSomeThing();
            } else {
                display((Composite) child);
            }
        }
    }
}
