class Solution
{
    public String mergeAlternately(String word1, String word2)
    {
        int w1Length = word1.length();
        int w2Length = word2.length();
        StringBuilder result = new StringBuilder();
        int index=0;
        
        while(index<w1Length && index<w2Length)
        {
            result.append(word1.charAt(index));
            result.append(word2.charAt(index));
            index++;
        }
        
        result.append(word1.substring(index, w1Length));
        result.append(word2.substring(index, w2Length));
        return result.toString();
    }
}