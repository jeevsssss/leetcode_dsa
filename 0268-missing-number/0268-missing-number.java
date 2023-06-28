// class Solution {
//     public int missingNumber(int[] nums) {
//         HashSet<Integer>st=new HashSet<>();
//         int ans=0;
//         for(int num:nums)
//         {
//             st.add(num);
//         }
//         for(int i=0;i<=nums.length;i++)
//         {
//             if(!st.contains(i))
//             {
//                 ans=i;
//             }
//         }
//         return ans;
//     }
// }
class Solution
{
    public int missingNumber(int[] nums)
    {
        int n = nums.length;
        int expectedsum = (n*(n+1))/2; 
        int currentsum=0;
        for(int i=0;i<n;i++)
            currentsum+=nums[i];

        return expectedsum-currentsum;
    }
}