class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>st=new HashSet<>();
        int ans=0;
        for(int num:nums)
        {
            st.add(num);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(!st.contains(i))
            {
                ans=i;
            }
        }
        return ans;
    }
}