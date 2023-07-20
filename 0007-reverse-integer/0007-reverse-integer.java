class Solution {
    public int reverse(int x) {
        long answer = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            answer = answer * 10 + digit;
            
            // Check for integer overflow
            if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) answer;
    }
}
