package com.mxy.design.iterator;

public interface Iterable<T> {

    boolean hasNext();

    T next();

    boolean remove();

}
