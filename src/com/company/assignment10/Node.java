package com.company.assignment10;

public class Node <E>{
    E item;
    Node<E> next;
    public Node(Node<E> next, E item) {
        this.next = next;
        this.item = item;

    }
}
