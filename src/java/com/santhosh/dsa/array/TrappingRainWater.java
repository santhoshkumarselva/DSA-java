package com.santhosh.dsa.array;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        solve(arr);
    }

    private static void solve(int[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.min(leftMax[i], leftMax[i-1]);
        }
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.min(rightMax[i], rightMax[i+1]);
        }
        int[] waterLevel = new int[n];
        for(int i=0; i<n; i++) {
            waterLevel[i] = Math.min(rightMax[i], leftMax[i]) - arr[i];
        }
        int totalVolume = 0;
        for(int i=0; i<n; i++) {
            totalVolume += waterLevel[i];
        }
        System.out.println("The total volume of water is " + totalVolume);
    }
}
