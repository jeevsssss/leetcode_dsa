class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currGain = 0, totalGain = 0, answer = 0;
        
        for (int i = 0; i < gas.length; ++i)
        {
            totalGain += gas[i] - cost[i];
            currGain += gas[i] - cost[i];
            if (currGain < 0)
            {
                answer = i + 1;
                currGain = 0;
            }
        }
        return totalGain >= 0 ? answer : -1;
    }
}