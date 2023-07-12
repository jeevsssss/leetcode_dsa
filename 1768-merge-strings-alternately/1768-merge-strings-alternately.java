class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int a=word1.length();
        int b=word2.length();
        int n=Math.max(a,b);
        for(int i=0;i<n;i++)
        {
            if(i<a)
            {
                res=res+word1.charAt(i);
            }
            if(i<b)
            {
                res=res+word2.charAt(i);
            }
            
        }
        return res;
    }
}