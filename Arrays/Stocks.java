public class Stocks {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, bestBuy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        Stocks stocks = new Stocks();
        int profit = stocks.maxProfit(prices);
        System.out.println(profit);

    }

}