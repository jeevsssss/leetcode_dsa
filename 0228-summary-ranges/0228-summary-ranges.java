class Solution {
    public List<String> summaryRanges(int[] nums)
    {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            while(i<nums.length-1 && nums[i]==nums[i+1]-1)
            {
                i++;
            }
            if(temp!=nums[i])
            {
                list.add(temp+"->"+nums[i]);
            }
            else
            {
                list.add(""+temp);
            }
        }
        return list;
    }
}