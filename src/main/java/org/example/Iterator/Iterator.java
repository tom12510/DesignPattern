package org.example.Iterator;

/**
 * 抽象迭代器
 */
public interface Iterator {
    Object next();

    boolean hasNext();

    boolean remove();
}
