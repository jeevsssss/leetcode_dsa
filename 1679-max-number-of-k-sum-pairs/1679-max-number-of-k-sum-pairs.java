class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(j>i)
        {
            int sum=nums[i]+nums[j];
            if(sum==k)
            {
                i++;
                j--;
                count++;
            }
            else if(sum<k)
            {
                i++;
            }
            else if(sum>k)
            {
                j--;
            }
        }
        return count;
        
    }
}