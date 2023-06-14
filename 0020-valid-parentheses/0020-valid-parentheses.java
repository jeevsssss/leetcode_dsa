class Solution {
public boolean isValid(String s) {
    Stack<Character> st=new Stack<>();
    int n=s.length();
    for(int i=0;i<n;i++)
    {
        char temp=s.charAt(i);
        if(temp=='(' || temp=='{' || temp=='[')
        {
            st.push(temp);
        }
        else if(temp==')' && !st.isEmpty() && st.peek()=='(')
        {
            st.pop();
        }
        else if(temp==']' && !st.isEmpty() && st.peek()=='[')
        {
            st.pop();
        }
        else if(temp=='}' && !st.isEmpty() && st.peek()=='{')
        {
            st.pop();
        }
        else
        {
            return false;
        }
    }
    return st.isEmpty();
}
}