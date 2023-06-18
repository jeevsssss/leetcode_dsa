class Solution
{
public List<List<String>> groupAnagrams(String[] strs)
{
	Map<String, List<String>> map = new HashMap<>();
	for(String str : strs) 
    {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		String sortedStr = new String(chars);
		map.putIfAbsent(sortedStr, new ArrayList<>());
		map.get(sortedStr).add(str);
	}
	return new ArrayList<>(map.values());
 }
}
