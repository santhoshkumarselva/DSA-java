package com.santhosh.dsa.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniquePermutation {
    List<String> findUniquePermutation(String s) {
        List<String> result = new ArrayList<>();
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        generatePermutations(charCount, "", s.length(), result);
        return result;
    }

    private void generatePermutations(Map<Character, Integer> charCount, String current, int remaining, List<String> result) {
        if (remaining == 0) {
            result.add(current);
            return;
        }

        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count > 0) {
                charCount.put(c, count - 1);
                generatePermutations(charCount, current + c, remaining - 1, result);
                charCount.put(c, count);
            }
        }
    }

    public static void main(String[] args) {
        UniquePermutation obj = new UniquePermutation();
        String input = "AA";
        List<String> result = obj.findUniquePermutation(input);
        System.out.println(result);
    }
}
