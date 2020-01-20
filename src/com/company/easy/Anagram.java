package com.company.easy;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("sanjeev", "eevsanj"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
            }
        }

//         if(map.values().stream().reduce(Integer::sum).get() == 0){
//             return true;
//         }
//         return false;
        return map.values().stream().allMatch(integer -> integer == 0);
    }
}
