package com.santhosh.dsa.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int n;
        int[] arr;
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        if(solve(arr, n)) {
            System.out.println("The array contains duplicate");
        } else {
            System.out.println("The array doesn't contain any duplicate value");
        }
    }

    private static boolean solve(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            if(set.contains(arr[i])) return true;
            else set.add(arr[i]);
        }
        return false;
    }
}
