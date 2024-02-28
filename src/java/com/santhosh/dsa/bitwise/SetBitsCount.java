package com.santhosh.dsa.bitwise;

import java.util.Scanner;

public class SetBitsCount {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("The binary form of the given input is " + Integer.toBinaryString(num));
        System.out.println("The count of set bits is " + setBitsCount(Integer.toBinaryString(num)));
    }

    private static int setBitsCount(String binaryForm) {
        int count =0;
        for(int i=0; i<binaryForm.length(); i++) {
            if(binaryForm.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
