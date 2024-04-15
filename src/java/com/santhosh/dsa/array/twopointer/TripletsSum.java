package com.santhosh.dsa.array.twopointer;

import java.util.*;

/*Given an array Arr consisting of N distinct integers.
The task is to count all the triplets such that sum of two elements equals the third element.*/

public class TripletsSum {

    public static int findTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--) {
            int left = 0;
            int right = i-1;
            while(left < right) {
                int sum = arr[left] + arr[right];
                if(sum == arr[i]) {
                    count++;
                    left++;
                    right--;
                } else if(sum > arr[i]) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
}
