package com.challenge;

import java.util.*;

class GroupAnagram {

    public static void main(String[] args) {
        String[] group = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        // Map<"eat", List<same-names>>  return List<List<same-names>>
        System.out.println(groupAnagrams(group));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list); //aet, eat
            } else { // map contains Key, take the value and add the str and add it to map
                List<String> values = map.get(sorted);
                values.add(str);
                map.put(sorted, values); // aet, (eat,tea)
            }
        }
        return new ArrayList<>(map.values());
    }
}