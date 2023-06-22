class Solution
{
    public int jump(int[] nums)
    {
        int n=nums.length;
        int cur=0;
        int max=0;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            max=Math.max(max,i+nums[i]);
            if(cur==i)
            {
                cur=max;
                count++;
            }
        }
        return count;
    }
}