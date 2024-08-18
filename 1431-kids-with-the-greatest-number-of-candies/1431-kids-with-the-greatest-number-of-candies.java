class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //Lets find maximum
        int max=candies[0];
        for(int i=1;i<candies.length;i++)
        {
            max=Math.max(max,candies[i]);
        }
        List<Boolean> result=new ArrayList<>(candies.length);
        //giving a kid extra candies . if it makes them max or more than that true or false
        for(int candy:candies)
        {
            result.add(candy+extraCandies>=max);
        }
        return result;
        
    }
}