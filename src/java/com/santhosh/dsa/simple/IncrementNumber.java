package com.santhosh.dsa.simple;

import java.util.Scanner;

public class IncrementNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        System.out.println("The solution is "+ solve(input));
    }

    private static int solve(String input) {
        int n = input.length();
        int multiplier = 1;
        int number = 0;
        for(int i = n-1; i>=0; i--) {
            char c = input.charAt(i);
            int digit = c - '0';
            number += (digit*multiplier);
            multiplier*=10;
        }
        return number+1;
    }
}
