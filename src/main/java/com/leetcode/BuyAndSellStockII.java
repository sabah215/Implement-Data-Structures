package com.leetcode;
/*
* Leetcode #122*/
public class BuyAndSellStockII {

    public static void main(String[] args) {

        //int [] prices = {7,1,5,3,6,4};
        int [] prices = {2, 1};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int buyPrice = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++){

            if(prices[i] > buyPrice){
                profit += prices[i] - buyPrice;
            }
            buyPrice = prices[i];
        }
        return profit;
    }
}
