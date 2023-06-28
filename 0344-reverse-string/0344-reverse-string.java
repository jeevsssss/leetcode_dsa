class Solution {
    public void reverseString(char[] s) {
        int front=0;
        int back=s.length-1;
        while(back>front)
        {
            char temp=s[back];
            s[back]=s[front];
            s[front]=temp;
            front++;
            back--;
        }
    }
}