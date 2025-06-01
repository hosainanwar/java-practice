package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class BestTimetoBuyAndSellStock {
  public int maxProfitFirstSolution(int[] prices) {
    // not working
    if (prices.length == 0) return 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < prices.length; i++) {
      map.put(i, prices[i]);
    }
    int buyingPrice = map.entrySet().stream().min(Map.Entry.comparingByValue()).get().getValue();
    int buyingDay = map.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
    int sellingPrice = 0;
    for (int i = 0; i < prices.length; i++) {
      if ((buyingDay <= i) && (buyingPrice < prices[i])) {
        sellingPrice = Math.max((prices[i] - buyingPrice), sellingPrice);
      }
    }
    return sellingPrice;
  }

  public int maxProfitSecondSolution(int[] prices) {
    if (prices.length == 0) return 0;
    int buyingPrice = prices[0];
    int sellingPrice = 0;
    for (int i = 1; i < prices.length; i++) {
      sellingPrice = Math.max(sellingPrice, prices[i] - buyingPrice);
      buyingPrice = Math.min(buyingPrice, prices[i]);
    }
    return sellingPrice;
  }

  public static void main(String[] args) {
    System.out.println("Best Time to Buy and Sell Stock");
//    int[] prices = new int[]{7,1,5,3,6,4};
    int[] prices = new int[]{2,4,1};
    BestTimetoBuyAndSellStock bst = new BestTimetoBuyAndSellStock();
    System.out.println(bst.maxProfitSecondSolution(prices));
  }
}
