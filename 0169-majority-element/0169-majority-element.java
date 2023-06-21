class Solution {
    public int majorityElement(int[] nums) {
        // high time and space complexity
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        int n=nums.length;
        int result=0;
        HashMap<Integer,Integer>set=new HashMap<Integer,Integer>();
        for(int num:nums)
        {
            if(!set.containsKey(num))
            {
                set.put(num,1);
            }
            else
            {
                set.put(num,set.get(num)+1);
            }
            if(set.get(num)>n/2)
            {
                result=num;
            }
        }
        return result;
    }
}