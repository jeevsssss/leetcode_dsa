class Solution {
    public List<List<Integer>> generate(int numRows) {        
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer>row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    row.add(1);
                }
                else
                {
                    List<Integer> pr=res.get(i-1);
                    int val=pr.get(j)+pr.get(j-1);
                    row.add(val);
                }
            }
            res.add(row);
        }
        return res;
    }
}