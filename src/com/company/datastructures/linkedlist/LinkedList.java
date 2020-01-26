package com.company.datastructures.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        //Node always as values
        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        Node node = new Node(item);

        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        Node node = new Node(item);
        if (first == null) {
            first = last = null;
        } else {
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;

        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        throw new IllegalArgumentException("Item not found");
    }

    public boolean contains(int item) {
        Node current = first;

        while (current != null) {
            if (current.value == item) return true;
            current = current.next;
        }
        throw new IllegalArgumentException("Item not found");
    }

    public void removeFirst() {
        // [10->20->30]
        // first ->10
        //last -> 30
        if (first == null) {
            throw new NoSuchElementException("no elements..cant remove");
        }
        if (first == last) {
            first = last = null;
            return;
        }
        Node temp = first.next; // 20th ref
        first.next = null; //[10 20->30]
        first = temp;
    }

    public void removeLast() {
        // [10->20->30 ->40], last-> 40
        if (first == null) {
            throw new NoSuchElementException("removeLast");
        }
        if (first == last) {
            first = last = null;
            return;
        }
        Node previous = getPrevious(last);
        //previous -> 30
        //last -> 40
        last = previous; //[10->20->30 40]
        last.next = null;
    }

    private Node getPrevious(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

}
