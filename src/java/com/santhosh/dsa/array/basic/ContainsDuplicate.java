package com.santhosh.dsa.array.basic;

import java.util.HashSet;
import java.util.Set;

//Check if an array contains duplicate values

public class ContainsDuplicate {
    public static boolean solve(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (set.contains(j)) return true;
            set.add(j);
        }
        return false;
    }
}
