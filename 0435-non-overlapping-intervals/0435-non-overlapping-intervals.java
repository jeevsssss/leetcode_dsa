class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int ans = 0;
        int k = Integer.MIN_VALUE;
        for (int i = 0; i < intervals.length; i++)
        {
            int x = intervals[i][0]; // start of interval
            int y = intervals[i][1]; // end of interval
            
            if (x >= k)
            {
                // no overlap
                k = y;
            }
            else
            {
                // overlap
                ans++;
            }
        }
        return ans;
    }
}