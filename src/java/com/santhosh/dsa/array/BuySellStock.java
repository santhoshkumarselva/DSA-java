package com.santhosh.dsa.array;

import java.util.Scanner;

public class BuySellStock {
    public static int solve(int[] stock) {
        int n = stock.length;
        if(n<2) return 0;
        int minValue = stock[0];
        int maxProfit = 0;
        for(int i=1; i<n; i++) {
            int currentProfit = stock[i] - minValue;
            if(currentProfit > maxProfit) maxProfit = currentProfit;
            if(minValue > stock[i]) minValue = stock[i];
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int n;
        int[] stock;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day");
        n = sc.nextInt();
        stock = new int[n];
        for(int i=0; i<n; i++) stock[i] = sc.nextInt();
        System.out.println(solve(stock));
    }
}
