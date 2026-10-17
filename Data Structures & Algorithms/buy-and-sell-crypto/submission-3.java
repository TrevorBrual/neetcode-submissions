public class Solution { // Dynamic programming
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minBuy = prices[0];

        for (int sell : prices) {
            maxP = Math.max(maxP, sell - minBuy); // Calculates the profit
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }
}
