package com.santhosh.dsa.array.basic;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solve(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(map.containsKey(arr[i])) {
                return new int[]{map.get(arr[i]), i};
            } else {
                map.put(arr[i], i);
            }
        }
        return null;
    }
}
