class Solution {
    public int trap(int[] height) {
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int max=-1;
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>=max)
            {
                max=height[i];
            }
            left[i]=max;
        }
        max=-1;
        for(int j=height.length-1;j>=0;j--)
        {
            if(height[j]>=max)
            {
                max=height[j];
            }
            right[j]=max;
        }
        int sum=0;
        for(int k=0;k<height.length;k++)
        {
            sum=sum+Math.min(left[k],right[k])-height[k];
        }
        return sum;
        
    }
}