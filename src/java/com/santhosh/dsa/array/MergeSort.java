package com.santhosh.dsa.array;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n - 1); // Pass the correct end index (n - 1)
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        // Copy data to temporary arrays arr1[] and arr2[]
        for (int i = 0; i < n1; ++i)
            arr1[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            arr2[j] = arr[mid + 1 + j];

        // Merge the temporary arrays back into arr[l..r]
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of arr1[], if any
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        // Copy the remaining elements of arr2[], if any
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
