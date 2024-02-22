package com.santhosh.dsa.array;

import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }

    private static int[] solve(int[] arr) {
        for(int i=0; i<arr.length-2; i++) {
            for(int j=1; j< arr.length-1; j++) {
                for(int k=2; k<arr.length-2; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) return new int[]{i, j, k};
                }
            }
        }
        return null;
    }
}
