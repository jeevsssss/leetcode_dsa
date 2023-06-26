class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;
        for(int j=s.length()-1;j>=0;j--)
        {
            if(s.charAt(j)!=' ')
            {
                count++;
            }
            else
            {
                if (count > 0) return count;
            }
        }
        return count;
        
    }
}