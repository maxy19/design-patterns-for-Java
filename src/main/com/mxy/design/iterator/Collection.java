package com.mxy.design.iterator;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class Collection<T> implements Iterable<T> {

    private List list;

    private int index = 0;

    public Collection(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.size()) {
            index = 0;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public T next() {
        Object object = null;
        if (index < list.size()) {
            object = list.get(index);
        }
        index++;
        return (T) object;
    }

    @Override
    public boolean remove() {
        list.remove(index - 1);
        index --;
        return true;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("list", list)
                .append("index", index)
                .toString();
    }
}
