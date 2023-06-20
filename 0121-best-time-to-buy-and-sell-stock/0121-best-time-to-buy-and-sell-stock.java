class Solution
{
        public int maxProfit(int[] prices)
        {
            int min=Integer.MAX_VALUE;
            int max=0;
            for(int x:prices)
            {
                min=Math.min(x,min);
                max=Math.max(x-min,max);
            }
            return max;
    }
}