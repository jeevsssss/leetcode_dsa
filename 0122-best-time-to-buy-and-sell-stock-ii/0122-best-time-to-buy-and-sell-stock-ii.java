class Solution
{
    public int maxProfit(int[] prices)
    {
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for(int x:prices)
        {
            buy=Math.min(buy,x-sell);
            sell=Math.max(sell,x-buy);
        }
        return sell;
    }
}