class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i,j;
        double sum=0;
        for(i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        double res=sum;
        for(j=k;j<nums.length;j++)
        {
            sum+=nums[j]-nums[j-k];
            res=Math.max(sum,res);
        }
        return res/k;
    }
}