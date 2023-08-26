class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int right=1;
        int left=1;
        int res=nums[0];
        for(int i=0;i<n;i++)
        {
            if(right==0)
            {
                right=1;
            }
            if(left==0)
            {
                left=1;
            }
            right=right*nums[n-1-i];
            left=left*nums[i];
            res=Math.max(res,Math.max(left,right));            
        }
        return res;
    }
}