class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store the anagram groups
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through each string in the input array
        for (String str : strs) {
            // Convert the string to a character array
            char[] chars = str.toCharArray();
            
            // Sort the characters in ascending order
            Arrays.sort(chars);
            
            // Convert the sorted character array back to a string
            String sortedStr = new String(chars);
            
            // Check if the sorted string exists as a key in the HashMap
            // If not, add it as a new key with an empty ArrayList as the value
            map.putIfAbsent(sortedStr, new ArrayList<>());
            
            // Add the original string to the corresponding anagram group
            map.get(sortedStr).add(str);
        }
        
        // Return a list containing all the anagram groups
        return new ArrayList<>(map.values());
    }
}
