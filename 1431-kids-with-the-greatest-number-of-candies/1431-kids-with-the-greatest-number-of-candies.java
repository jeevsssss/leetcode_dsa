class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // int max = 0;
        // Find the maximum candies that one has
        // for (int x : candies)
        // {
        //     max = Math.max(max, x);
        // }
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        List<Boolean> result = new ArrayList<>(candies.length);
        // Add the candies they have with the extra candy and see if that makes them have more than the maximum candies someone has; if it does, then it's true, otherwise, it's false
        for (int y : candies) {
            result.add(y + extraCandies >= max);
        }
        return result;
    }
}