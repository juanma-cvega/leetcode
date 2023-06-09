package com.jusoft.leetcode.arrays.besttimetobuyandsellstockII;

public class BestTimeToBuyAndSellStockII {
    public int algo(int[] prices) {
        int profit = 0;
        int current = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > current) {
                profit += prices[i] - current;
            }
            current = prices[i];
        }
        return profit;
    }
}
