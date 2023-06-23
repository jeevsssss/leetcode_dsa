class Solution {
    public List<String> summaryRanges(int[] nums) {
       ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i<nums.length-1 && nums[i]==nums[i+1]-1)
                i++;
            if(start!=nums[i]){
                al.add(start+"->"+nums[i]);
            }
            else{
                al.add(""+start);
            }
        }
        return al;
    }
}