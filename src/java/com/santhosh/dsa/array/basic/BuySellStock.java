package com.santhosh.dsa.array.basic;

//Find Maximum Profit from Buying and Selling a Stock

public class BuySellStock {
    public static int solve(int[] stock) {
        int n = stock.length;
        if(n<2) return 0;
        int minValue = stock[0];
        int maxProfit = 0;
        for(int i=1; i<n; i++) {
            int currentProfit = stock[i] - minValue; /*** the order of steps ***/
            if(currentProfit > maxProfit) maxProfit = currentProfit;
            if(minValue > stock[i]) minValue = stock[i];
        }
        return maxProfit;
    }
}