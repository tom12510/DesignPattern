package org.example.Iterator;

public interface Aggregate {
    void add(Object object);

    void remove(Object object);

    public Iterator iterator();
}
