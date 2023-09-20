class Solution
{
    public int mySqrt(int x)
    {
        if (x == 0) return 0;
        int left = 1;
        int right = x;
        int result = 0;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid)
            {
                left = mid + 1;
                result = mid;
            }
            else
            {
                right = mid - 1;
            }
        }
        return result;
    }
}