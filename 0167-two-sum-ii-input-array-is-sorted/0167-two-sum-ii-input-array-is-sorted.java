class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(end>start)
        {
            if(numbers[start]+numbers[end]>target)
            {
                end--;
            }
            else if(numbers[start]+numbers[end]<target)
            {
                start++;
            }
            else
            {
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{-1,-1};
    }
}