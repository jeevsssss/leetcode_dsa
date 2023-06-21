class Solution 
{
    public void merge(int[] A, int m, int[] B, int n) 
    {
        int a_end=m-1;
        int b_end=n-1;
        int a_last=m+n-1;
        while(a_end>=0 && b_end>=0)
        {
            if(A[a_end]>B[b_end])
            {
                A[a_last--]=A[a_end--];
            }
            else
            {
                A[a_last--]=B[b_end--];
            }
        }
        while(b_end>=0)
        {
            A[a_last--]=B[b_end--];
        }
    }
}