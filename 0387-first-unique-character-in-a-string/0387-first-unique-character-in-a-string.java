
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> st = new HashMap<>();
        
        for (char x : s.toCharArray()) {
            if (!st.containsKey(x)) {
                st.put(x, 1);
            } else {
                st.put(x, st.get(x) + 1);
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (st.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
