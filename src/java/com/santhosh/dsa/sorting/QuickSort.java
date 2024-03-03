package com.santhosh.dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int l, int r) {
        if(l < r) {
            int partitionIndex = partition(arr, l, r);
            sort(arr, l, partitionIndex-1);
            sort(arr, partitionIndex + 1, r);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int partitionElement = arr[r], indexLow = l;
        for(int i=l; i<r; i++ ) {
            if(arr[i] < partitionElement) {
                swap(arr, indexLow, i);
                indexLow++;
            }
        }
        swap(arr, indexLow, r);
        return indexLow;
    }

    private static void swap(int[] arr, int indexLow, int i) {
        int a = arr[indexLow];
        arr[indexLow] = arr[i];
        arr[i] = a;
    }
}
