class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE / 2;
        int sell = 0;

        for (int x : prices) {
            buy = Math.min(buy, x);
            int profit = x - buy;
            sell = Math.max(sell, profit);
        }

        return sell;
    }
}
