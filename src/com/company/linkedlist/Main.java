package com.company.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    //head , tail
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(400);

        linkedList.remove(0);
        linkedList.addFirst(234);
        linkedList.addFirst(234);
        linkedList.addLast(256);
        linkedList.removeFirstOccurrence(234);
        linkedList.removeLastOccurrence(234);
        System.out.println(linkedList);

        final Object[] objects = linkedList.toArray();

        System.out.println(Arrays.toString(objects));

        // LinkedLink implemtation here.

    }
}
