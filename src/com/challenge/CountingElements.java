package com.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingElements {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 5, 0, 0};
        int count = countingElements(nums);
        System.out.println(count);
    }

    private static int countingElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // num, count
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1); // (1, 3), (3,2), (2,1), (5,1), (0,1)// Traverse the array o(n) and build the map
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        ArrayList<Integer> numbers = new ArrayList<>(map.keySet());
        int count =0;
        for (int num : numbers) {
            if (map.containsKey(num + 1)) {
                count = count + map.get(num);
            }
        }
        return count;
    }

}
