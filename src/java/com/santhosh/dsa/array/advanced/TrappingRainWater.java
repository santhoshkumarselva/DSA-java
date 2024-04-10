package com.santhosh.dsa.array.advanced;

//Given an array of N non-negative integers arr[] representing an elevation map
//where the width of each bar is 1, compute how much water it is able to trap after raining.

public class TrappingRainWater {
    public static int solve(int[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int water = 0;
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Integer.max(arr[i], leftMax[i-1]);
        }
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Integer.max(arr[i], rightMax[i+1]);
        }

        for(int i=0; i<n; i++) {
            water += Integer.min(rightMax[i], leftMax[i]) - arr[i];
        }

        return water;
    }
}
