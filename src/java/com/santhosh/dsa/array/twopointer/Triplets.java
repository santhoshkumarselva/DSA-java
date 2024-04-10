package com.santhosh.dsa.array.twopointer;

import java.util.Arrays;
import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(solve(arr)));
    }

    private static int[] solve(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            int l = i+1;
            int r = n-1;
            while(l<r) {
                if(arr[i] + arr[l] + arr[r] == 0) return new int[]{i, l, r};
                l++;
                r--;
            }
        }
        return null;
    }
}
