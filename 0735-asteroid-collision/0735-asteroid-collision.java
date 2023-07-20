import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < asteroids.length; i++)
        {
            if (st.isEmpty() || asteroids[i] > 0)
            {
                st.push(asteroids[i]);
            }
            else
            {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i]))
                {
                    st.pop();
                }
                if (st.isEmpty() || st.peek() < 0)
                {
                    st.push(asteroids[i]);
                }
                else if (st.peek() == Math.abs(asteroids[i]))
                {
                    st.pop();
                }
            }
        }

        // Convert the stack to the result array
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
