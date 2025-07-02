package practice;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println("maxProfit --> " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int maxProfit = 0;
        int minPriceBuy = prices[0];
        for (int i = 1, j = prices.length -1; i < j; i++, j--) {
            minPriceBuy = Math.min(minPriceBuy, prices[i]);
            if((prices[j] - minPriceBuy) == 8){
                System.out.println("Buy at: " + minPriceBuy);
                System.out.println("Sell at: " + prices[j]);
                System.out.println(prices[j] + " - " + minPriceBuy);
            }
            maxProfit = Math.max(maxProfit, prices[j] - minPriceBuy);
        }
        return maxProfit;
    }
}
