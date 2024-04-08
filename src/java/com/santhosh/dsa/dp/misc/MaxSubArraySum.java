package com.santhosh.dsa.dp.misc;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements : " );
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the numbers: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The max sum is " + solve(arr));
    }

    private static int solve(int[] arr) {
        int maxSum = arr[0];
        int currentsum = arr[0];
        int n = arr.length;
        for(int i=1; i<n; i++) {
            currentsum = Integer.max(arr[i], currentsum + arr[i]);
            maxSum = Integer.max(currentsum, maxSum);
        }
        return maxSum;
    }
}
