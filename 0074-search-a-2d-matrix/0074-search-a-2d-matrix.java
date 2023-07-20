class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int low=0;
        int high=rows*cols-1; //to access the right most bottom element 
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int midpoint=matrix[mid/cols][mid%cols];
            if(midpoint==target) return true;
            else if(midpoint>target) high=mid-1;
            else if(midpoint<target) low=mid+1;
        }
        return false;
    }
}