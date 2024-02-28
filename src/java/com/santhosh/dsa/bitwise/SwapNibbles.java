package com.santhosh.dsa.bitwise;

import java.util.Scanner;

public class SwapNibbles {
    public static void main(String[] args) {
        Byte num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextByte();
        System.out.println("The binary representation of the byte value is "+ String.format("%8s", Integer.toBinaryString(num & 0xFF)).replaceAll(" ", "0"));
        System.out.println(String.format("%8s", Integer.toBinaryString(solve(num))).replaceAll(" ", "0"));
    }

    private static int solve(byte num) {
        int leftNibble = num & 0xF0;
        leftNibble = leftNibble >> 4;
        int rightNibble = num & 0x0F;
        rightNibble = rightNibble << 4;
        int swappedNibble = leftNibble | rightNibble;
        return swappedNibble;
    }
}
