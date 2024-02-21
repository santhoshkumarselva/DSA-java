package com.santhosh.dsa.dp;

import java.util.Arrays;
import java.util.Scanner;
public class CoinsChange {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins:");
        n = sc.nextInt();
        int[] coins = new int[n];
        System.out.println("Enter the value of each coins");
        for(int i=0;i<n;i++) {
            coins[i] = sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        System.out.println(solve(coins, target));
    }

    private static int solve(int[] coins, int target) {
        int[] tab = new int[target+1];
        Arrays.fill(tab, Integer.MAX_VALUE);
        tab[0] = 0;
        for(int i=0; i<target+1; i++) {
            for(int j=0; j<coins.length; j++) {
                if(i-coins[j] >= 0) {
                    tab[i] = Math.min(tab[i], tab[i-coins[j]] +1);
                }
            }
        }
        if(tab[target] == Integer.MAX_VALUE) return -1;
        else return tab[target];
    }
}
