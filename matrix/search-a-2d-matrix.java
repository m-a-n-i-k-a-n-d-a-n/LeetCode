class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0,r=(m*n)-1,mid,rowidx,colidx;
        while(l<=r)
        {
            mid=(l+r)/2;
            rowidx=mid/n;
            colidx=mid%n;
            if(matrix[rowidx][colidx]==target) return true;
            else if(matrix[rowidx][colidx]<target) l=mid+1;
            else r=mid-1;
        }
        return false;
    }
}