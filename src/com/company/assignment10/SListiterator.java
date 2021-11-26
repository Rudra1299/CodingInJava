package com.company.assignment10;

public class SListiterator<E> {
    Node<E> head;
    Node<E> tail;
    Node<E> reader;
    private static int size;
    public SListiterator(int size) {
        this.head = new Node<>(null, null);
        this.tail = new Node<>(null, null);
        this.head.next = this.tail;
        this.size = size;
        this.reader = head;
    }
    public void add(E item){
        Node<E> node= new Node<>(null, item);
        if(this.head.next.equals(this.tail)) {
            head.next = node;
            tail.next = node;
        }
        else {
            Node<E> prev = tail.next;
            prev.next = node;
            tail.next = node;
        }
        this.size++;
    }

    public void add(int pos, E item) throws IllegalAccessException{
        if(pos >= this.size) {
            throw new IllegalAccessException("index does not exist");
        }
        else {
            Node<E> index = head;
            while(pos > 0) {
                index = index.next;
                pos--;
            }
            Node<E> nextNode = index.next;
            Node<E> node = new Node<E>(null, item);
            index.next = node;
            node.next = nextNode;
        }
        this.size++;
    }

    public E remove(E item) throws IllegalAccessError{
        if(this.size == 0) {
            throw new IllegalAccessError("list is empty");
        }

        Node<E> index = head;
        while(index.next != null) {
            Node<E> nextNode = index.next;
            if(nextNode.item.equals(item)) {
                index.next = nextNode.next;
                E itemReturn = nextNode.item;
                nextNode.next = null;
                return item;
            }
            index = index.next;
        }

        return null;

    }

    public boolean hasNext() {
        if(this.reader.next == tail || this.reader.next == null) return false;
        return true;
    }

    public E next() {
        E itemReturn = reader.next.item;
        reader = reader.next;
        return itemReturn;
    }

    public int size() {
        return this.size;
    }
    @Override
    public String toString() {
        Node<E> index = head;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++) {
            sb.append(index.next.item.toString());
            sb.append(" ");
        }

        return sb.toString();
    }


}
