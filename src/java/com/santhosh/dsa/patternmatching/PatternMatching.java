package com.santhosh.dsa.patternmatching;

import java.util.Scanner;

public class PatternMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern: ");
        String pattern = sc.nextLine();
        System.out.println("Enter the string to check for pattern matching: ");
        String inputString = sc.nextLine();
        solve(inputString, pattern);
    }

    private static void solve(String inputString, String pattern) {
        int lps[] = computeLPS(pattern);
        int i = 0, j = 0;
        while( i < inputString.length()) {
            if(inputString.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else if( j != 0) {
                j = lps[j-1];
            } else {
                i++;
            }
            if(j==pattern.length()) {
                System.out.println("Pattern found at " + (i-(pattern.length())));
                j = lps[j-1];
            }
        }
    }

    private static int[] computeLPS(String pattern) {
        int length = 0;
        int n = pattern.length();
        int[] lps = new int[n];
        lps[0] = 0;
        int i = 1;
        while(i<n) {
            if(pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            }
            else {
                if(length != 0) {
                    length = lps[length-1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
