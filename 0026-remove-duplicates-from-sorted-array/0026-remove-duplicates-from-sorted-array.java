class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int x=1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[x]=nums[i+1];
                x++;
            }
        }
        return x;
    }
}