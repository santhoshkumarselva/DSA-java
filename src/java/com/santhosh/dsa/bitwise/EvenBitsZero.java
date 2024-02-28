package com.santhosh.dsa.bitwise;

import java.util.Scanner;

public class EvenBitsZero {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("The binary form of input is " + Integer.toBinaryString(num));
        System.out.println("The solution is " + changeEvenBitsToZero(num));
        System.out.println("The binary form of solution is " + Integer.toBinaryString(changeEvenBitsToZero(num)));
    }

    private static int changeEvenBitsToZero(int num) {
        for(int i=0; i<32; i=i+2) {
            int mask = 1 << i;
            num = num & (~mask);
        }
        return num;
    }
}
