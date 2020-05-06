package com.easy;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {

        System.out.println(topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2));
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // // init heap 'the less frequent element first'
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(map::get).reversed());

        //insertion logic with count
        map.forEach((key, value) -> priorityQueue.offer(value));

        List<Integer> result = new ArrayList<>();
        while (k-- > 0) {
            result.add(priorityQueue.poll());
        }
        return result;

    }
}
