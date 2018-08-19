package bksum.leetcode.fb.dp;

import java.util.Arrays;

public class BestTimeBuySellStock {


    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        int bestBuyPrice = Integer.MAX_VALUE;

        for(int price : prices){
            if(price<bestBuyPrice){
                //buy
                bestBuyPrice = price;
            }else if((price - bestBuyPrice) > bestProfit){
                //sell
                bestProfit = price - bestBuyPrice;
            }
        }
        return bestProfit;
    }

    public int maxProfitSlow(int[] prices) {
        int bestProfit = 0;
        for(int i=0; i<prices.length-1; i++){
            bestProfit = Math.max(bestProfit, bestSellPrice(Arrays.copyOfRange(prices, i+1, prices.length)) - prices[i]);
        }
        return bestProfit;
    }

    private int bestSellPrice(int[] sellPrices){
        int bestSellPrice = Integer.MIN_VALUE;
        for(int buyingPrice : sellPrices){
            bestSellPrice = Math.max(buyingPrice, bestSellPrice);
        }
        return bestSellPrice;
    }
}
