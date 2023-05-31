class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer>hash=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int temp=target-nums[i];
            if(hash.containsKey(temp))
            {
                return new int[]{hash.get(temp),i};
            }
            hash.put(nums[i],i);
        }
        return new int[0];
    }
}