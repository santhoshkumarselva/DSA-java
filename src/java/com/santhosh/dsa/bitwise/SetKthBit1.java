package com.santhosh.dsa.bitwise;

import java.util.Scanner;

public class SetKthBit1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(" The binary representation of given input is " + String.format("%32s", Integer.toBinaryString(num)).replaceAll(" ", "0"));
        System.out.println(" The solution is " + solve(num, k));
        System.out.println(" The binary representation of given input is " + String.format("%32s", Integer.toBinaryString(solve(num, k))).replaceAll(" ", "0"));
    }

    private static int solve(int num, int k) {
        int mask = 1 << k;
        num = num | mask;
        return num;
    }
}
