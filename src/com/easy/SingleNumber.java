package com.easy;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{}));
        System.out.println(singleNumber2(new int[]{2, 2, 1}));
    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }

    private static int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) set.add(num);
            else set.remove(num);
        }
        for (int num : set) {
            return num;
        }
        return -1;
    }
}



