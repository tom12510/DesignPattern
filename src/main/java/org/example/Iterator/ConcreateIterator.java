package org.example.Iterator;

import java.util.Vector;

/**
 * 实现迭代器接口
 */
public class ConcreateIterator implements Iterator {

    private Vector vector = new Vector();

    public int cursor = 0;

    @SuppressWarnings("unchecked*")
    public ConcreateIterator(Vector vector) {
        this.vector = vector;
    }


    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
