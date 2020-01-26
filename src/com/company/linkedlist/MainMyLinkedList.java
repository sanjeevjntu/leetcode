package com.company.linkedlist;

public class MainMyLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(5);

        int index = linkedList.indexOf(10);
        System.out.println(index);

        boolean contains = linkedList.contains(30);
        System.out.println(contains);

        linkedList.removeFirst();

        linkedList.removeLast();
        linkedList.removeLast(); //first=last=10
        linkedList.removeLast(); // //first=last= null
    }

}
