package com.company.datastructures.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(40);

        list.remove(new Integer(20));
        list.remove(1);
        System.out.println(list);
        Object[] numbers = list.toArray();

        for(Object num: numbers){
            System.out.println(num);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);

        System.out.println(linkedList);
    }
}
