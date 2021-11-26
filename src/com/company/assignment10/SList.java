package com.company.assignment10;

public class SList<E> {
    private static int size = 0;
    SListiterator<E> listIterator;
    public SList() {
        this.listIterator = new SListiterator<>(this.size);
    }

    @Override
    public String toString() {
        if(size == 0) return "";
        return listIterator.toString();
    }

    public SListiterator<E> iterator() {
        return this.listIterator;
    }

}
