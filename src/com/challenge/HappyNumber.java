package com.challenge;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    private static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
       // int counter = 7;
        while (true) {
            int sum = 0;
            while (n > 0) { // 342 = 0 + (2*2)
                 sum = sum + (n % 10) * (n % 10);
                 n /= 10; // 34
            }
           //sum = 4 + 16 + 9 = 29
            if(sum == 1) {
                return true;
            } else {
                if(set.contains(sum))
                    return false;
                else {
                    set.add(sum); //342, 29
                    n = sum;
                }

            }
           // counter--;
        }
    }
}
