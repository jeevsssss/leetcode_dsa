class Solution
{
    public int longestPalindrome(String s)
    {
        HashMap<Character, Integer> st = new HashMap<>();
        
        for (char x : s.toCharArray())
        {
            st.put(x, st.getOrDefault(x, 0) + 1);
        }
        
        int count = 0;
        boolean hasOdd = false;
        
        for (int i : st.values())
        {
            if (i % 2 == 0)
            {
                count += i;
            }
            else
            {
                count += i - 1;
                hasOdd = true;
            }
        }
        
        return hasOdd ? count + 1 : count;
    }
}
