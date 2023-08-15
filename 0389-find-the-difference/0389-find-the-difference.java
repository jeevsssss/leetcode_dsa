class Solution {
    public char findTheDifference(String s, String t)
    {
        int n=s.length();
        int m=t.length();
        char c='\0';
        for(int i=0;i<n;i++)
        {
            c^=s.charAt(i);
        }
        for(int j=0;j<m;j++)
        {
            c^=t.charAt(j);
        }
        return c;
    }
}