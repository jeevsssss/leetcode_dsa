class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        while(n!=1)
        {
            if(!set.contains(n))
            {
                set.add(n);
            }
            else
            {
                return false;
            }
            int sum=0;
            while(n>0)
            {
                int temp=n%10;
                sum=sum+temp*temp;
                n=n/10;
            }
            n=sum;
        }
        return true;
    }
}