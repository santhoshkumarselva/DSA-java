package com.santhosh.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubarryKDistinct {
    public static void main(String[] args) {
        SmallestSubarryKDistinct obj = new SmallestSubarryKDistinct();
        int[] arr = new int[] { 1, 1, 2, 2, 3, 3, 4, 5};
        int k = 3;
        System.out.println(obj.solve(arr, k));
    }
    int solve(int[] arr, int k) {
        int left = 0, right = 0;
        int n = arr.length;
        int distinctCount = 0;
        int smallestSubArrSize = Integer.MAX_VALUE;
        Map<Integer, Integer> frequency = new HashMap<>();
        while (right < n) {
            if(frequency.containsKey(arr[right])) {
                frequency.put(arr[right], frequency.get(arr[right])+1);
            } else {
                frequency.put(arr[right], 1);
                distinctCount++;
            }
            while(distinctCount>k) {
                frequency.put(arr[left], frequency.get(arr[left])-1);
                if(frequency.get(arr[left]) == 0) distinctCount--;
                left++;
            }
            if(distinctCount == k)
                smallestSubArrSize = Integer.min(smallestSubArrSize, right - left + 1);
            right++;
        }
        while(left<n) {
            frequency.put(arr[left], frequency.get(arr[left]) - 1);
            if(frequency.get(arr[left]) != 0) smallestSubArrSize--;
            else break;
            left++;
        }

        if(smallestSubArrSize == Integer.MAX_VALUE) return -1;
        else return  smallestSubArrSize;
    }
}
