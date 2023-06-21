class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2)
        {
            return n;
        }
        int x = 2;
        for (int i = 2; i < n; i++)
        {
            if (nums[i] != nums[x - 2])
            {
                nums[x] = nums[i];
                x++;
            }
        }
        
        return x;
    }
}
