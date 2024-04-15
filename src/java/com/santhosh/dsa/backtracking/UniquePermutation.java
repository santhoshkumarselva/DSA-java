package com.santhosh.dsa.backtracking;

/*Given a string S.
The task is to print all unique permutations of the given string that may contain
duplicates in lexicographically sorted order.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniquePermutation {
    public static List<String> findUniquePermutation(String input) {
        List<String> solution = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        int n = input.length();
        for(int i=0; i<n; i++) {
            map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0)+1);
        }
        findUniquePermutationHelper(map, n, "", solution);
        return solution;
    }

    private static void findUniquePermutationHelper(Map<Character, Integer> map, int n, String s, List<String> solution) {
        if(n==0) {
            solution.add(s);
        } else {
            for(char c : map.keySet()) {
                if(map.get(c) > 0) {
                    map.put(c, map.getOrDefault(c, 0)-1);
                    findUniquePermutationHelper(map, n-1, s+c, solution);
                    map.put(c, map.getOrDefault(c, 0)+1);
                }
            }
        }
    }
}
