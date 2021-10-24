package org.example.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 深拷贝
 */
public class CloneThing implements Cloneable {
    //聚合(同一生命周期)
    private ArrayList<String> arrList = new ArrayList<>();

    @Override
    protected Object clone() {
        CloneThing cloneThing = null;

        try {
            cloneThing = (CloneThing) super.clone();
            cloneThing.arrList = (ArrayList<String>) this.arrList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneThing;

    }
}
