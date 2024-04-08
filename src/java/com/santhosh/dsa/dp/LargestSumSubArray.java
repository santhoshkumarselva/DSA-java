package com.santhosh.dsa.dp;

import java.util.Scanner;

public class LargestSumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The solution is " + solve(arr));
    }

    public static int solve(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i=1; i<arr.length; i++) {
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
