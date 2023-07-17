class Solution
{
    public int singleNumber(int[] nums)
    {
        int asn = 0; 
        for(int num: nums)
        {
            asn ^= num;
        }
        return asn;
    }
}