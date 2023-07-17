class Solution {
    public int[] countBits(int n) {
        int size=n+1;
        int[] result=new int[size];
        // for(int i=0;i<size;i++)
        // {
        //     int sum=0;
        //     while(i>=0)
        //     {
        //         sum=i%2;
        //         i/=2;
        //     }
        //     result[size]=sum;
        // }
        // return result;
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                result[i]=result[i/2];
            }
            else
            {
                result[i]=result[i/2]+1;
            }
        }
        return result;
        
    }
}