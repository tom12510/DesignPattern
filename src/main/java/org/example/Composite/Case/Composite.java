package org.example.Composite.Case;

import java.util.ArrayList;

/**
 * 融合Component与Left
 */
public class Composite extends Component {
    // 构件容器
    private ArrayList<Component> components = new ArrayList<>();

    public void add(Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        this.components.remove(component);
    }

    public ArrayList<Component> getChildren() {
        return this.components;
    }

    @Override
    public void doSomeThing() {
        System.out.println("Composite doSomeThing");
    }

}
