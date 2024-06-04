package com.santhosh.dsa.array.advanced;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public static void main(String[] args) {
        IsIsomorphic obj = new IsIsomorphic();
        String input1 = "badc";
        String input2 = "baba";
        System.out.println(obj.solve(input1, input2));
    }

    private boolean solve(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                if (map1.get(s.charAt(i)) != t.charAt(i)) return false;
            } else {
                map1.put(s.charAt(i), t.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (map2.containsKey(t.charAt(i))) {
                if (map2.get(t.charAt(i)) != s.charAt(i)) return false;
            } else {
                map2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
