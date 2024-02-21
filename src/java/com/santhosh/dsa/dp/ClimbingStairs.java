package com.santhosh.dsa.dp;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }

    private static void solve(int n) {
        int[] mem = new int[n + 1];
        Arrays.fill(mem, -1);
        System.out.println("The solution is " + solveUtil(n, mem));
    }

    private static int solveUtil(int n, int[] mem) {
        if(n <= 1) {
            return n;
        }
        if(mem[n] != -1) {
            return mem[n];
        }
        mem[n] = solveUtil(n - 1, mem) + solveUtil(n - 2, mem);
        return mem[n];
    }
}
