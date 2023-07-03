public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums==null || nums.length<1){
            return new int[]{-1,-1};
        }
        
        int start=searchBinary(nums,target);
        if(start==nums.length || nums[start]!=target){
            return new int[]{-1,-1};
        }
        
        int end = searchBinary(nums,target+1);
        return new int[]{start,end-1};
    }
    
    public int searchBinary(int[] nums,int target){
        int i=0;
        int j=nums.length;
        while(i<j){
            int mid=(i+j)>>>1;
            if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        
        return i;
    }
}