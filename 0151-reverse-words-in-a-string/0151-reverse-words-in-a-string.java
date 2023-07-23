class Solution
{
    public String reverseWords(String s)
    {
        String[] str=s.trim().split("\\s+");
        int right=str.length-1;
        int left=0;
        while(right>left)
        {
            String temp=str[right];
            str[right]=str[left];
            str[left]=temp;
            left++;
            right--;
        }
        return String.join(" ",str);
    }
}