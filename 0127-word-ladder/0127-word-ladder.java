class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Create sets to store intermediate words
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        
        // Add the initial words to the sets
        beginSet.add(beginWord);
        endSet.add(endWord);
        
        // Create a set to store the wordList
        Set<String> dict = new HashSet<>(wordList);
        
        // If endWord is not present in dict, return 0
        if (!dict.contains(endWord))
            return 0;
        
        // Call the search method with initial sets and parameters
        return search(beginSet, endSet, dict, true, 1);
    }
    
    // Helper method for performing breadth-first search
    private int search(Set<String> beginSet, Set<String> endSet, Set<String> dict, boolean isForward, int cnt) {
        // If either set is empty, no transformation is possible, return 0
        if (beginSet.isEmpty() || endSet.isEmpty())
            return 0;
        
        // Increment the count of transformations
        cnt++;
        
        // Remove words from dict that are already visited
        dict.removeAll(beginSet);
        
        // Create a set for storing intermediate words in the next transformation
        Set<String> nextSet = new HashSet<>();
        
        // Iterate over each word in beginSet
        for (String str : beginSet) {
            char[] chs = str.toCharArray();
            
            // Try changing each character of the word
            for (int i = 0; i < chs.length; i++) {
                char c = chs[i];
                
                // Try all lowercase letters from 'a' to 'z'
                for (char j = 'a'; j <= 'z'; j++) {
                    chs[i] = j;
                    String tmp = new String(chs);
                    
                    // If the modified word is not in dict, skip to next iteration
                    if (!dict.contains(tmp))
                        continue;
                    
                    // If the modified word is in endSet, transformation sequence found, return count
                    if (endSet.contains(tmp))
                        return cnt;
                    
                    // Add the modified word to nextSet for further exploration
                    nextSet.add(tmp);
                }
                
                // Restore the original character
                chs[i] = c;
            }
        }
        
        // Recursive call with updated sets and parameters based on the size of nextSet and endSet
        return nextSet.size() > endSet.size()
            ? search(endSet, nextSet, dict, false, cnt)
            : search(nextSet, endSet, dict, true, cnt);
    }
}
