package com.company.datastructures.array;

import com.company.datastructures.MyLinkedList;

public class Main {

    public static void main(String[] args) {

        DynamicArray numbers = new DynamicArray(4);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);

        numbers.removeAt(1);

        numbers.print();

        System.out.println(numbers.indexOf(60));

    }
}
