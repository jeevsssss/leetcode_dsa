class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] result=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                result[i]=st.peek()-i;
            }
            st.push(i);
        }
        return result;
        
    }
}