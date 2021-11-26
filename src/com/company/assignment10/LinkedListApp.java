package com.company.assignment10;

public class LinkedListApp {
    public static void main(String[] args) {
        try {
            SList<Integer> slist = new SList<>();
            System.out.println("start");
            SListiterator<Integer> iterator = slist.iterator();
            iterator.add(1);
            iterator.add(2);
            iterator.add(3);
            iterator.add(2, 8);
            Integer item = iterator.remove(3);
            System.out.println(iterator.hasNext());
            System.out.println(iterator.size());
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
