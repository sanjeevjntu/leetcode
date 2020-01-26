package com.company.datastructures.array;

/**
 * 1. Fibonacci time space
 * 2. Merging two sorted arrays
 * 3. Grub hub mean number etc
 */
public class DynamicArray {
    private int[] items;
    private int count;

    public DynamicArray(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }

    }

    public void insert(int number) {
        // step 1 - if the array is full resize it
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        //step 2
        items[count++] = number;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Index out of range");
        }
        for (int i = index; i < count - 1; i++)
            items[i] = items[i + 1];
        count--;
    }

    // search operation
    public int indexOf(int item) {
        for (int i = 0; i < count ; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        throw new IllegalArgumentException("Item not found");
    }
}
