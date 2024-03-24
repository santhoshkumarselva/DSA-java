package com.santhosh.dsa.slidingwindow;

import java.util.Scanner;

public class SmallestSubArrayTargetSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int target;
        System.out.println("Enter the target:");
        target = sc.nextInt();
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The solution is "+ solve(arr, target));
    }

    private static int solve(int[] arr, int target) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int smallestSum = Integer.MAX_VALUE;
        while(right < arr.length) {
            currentSum+=arr[right];
            while(currentSum > target) {
                currentSum-=arr[left];
                left++;
            }
            if(currentSum == target) {
                smallestSum = Integer.min(smallestSum, right-left+1);
            }
            right++;
        }
        return  smallestSum;
    }
}
