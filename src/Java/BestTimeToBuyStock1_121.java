package Java;

public class BestTimeToBuyStock1_121 {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int high = prices[0];
        int profit = 0;
        int allTimeProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (low > prices[i]){
                low = prices [i];
                high = 0;
            }
            if (high < prices[i]){
                high = prices [i];
            }
            profit = high - low;
            allTimeProfit = Math.max(allTimeProfit, profit);
        }

        return Math.max(allTimeProfit, 0);
    }
}
