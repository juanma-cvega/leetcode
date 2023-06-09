package com.jusoft.leetcode.arrays.besttimetobuyandsellstock;

public class BestTimeToBuyAndSellStock {
    public int algo(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            int newProfit = price - min;
            if (profit < newProfit) {
                profit = newProfit;
            }
        }
        return profit;
    }
}
