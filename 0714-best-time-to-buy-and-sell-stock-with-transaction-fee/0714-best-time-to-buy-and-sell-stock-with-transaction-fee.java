class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for (int price : prices) {
            buy = Math.min(buy, price - sell);
            sell = Math.max(sell, price - buy - fee);
        }

        return sell;
    }
}
