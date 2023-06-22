class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0;
        int j=s.length()-1;
        while(j>=i)
        {
            char front=s.charAt(i);
            char last=s.charAt(j);
            if(front!=last)
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}