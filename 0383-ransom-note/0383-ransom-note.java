class Solution {
public boolean canConstruct(String ransomNote, String magazine)
{
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char i : magazine.toCharArray())
        {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            }
            else 
            {
                hm.put(i, 1);
            }
        }
        for (char i : ransomNote.toCharArray())
        {
            if (!hm.containsKey(i) || hm.get(i) == 0)
            {
                return false;
            }
            else
            {
                hm.put(i, hm.get(i) - 1);
            }
        }
        return true;
    }

}