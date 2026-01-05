class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        long sum=0;
        int c=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int x=Math.abs(matrix[i][j]);
                sum+=x;
                if(matrix[i][j]<0)c++;
                min=Math.min(min,x);
            }
        }
        if(c%2==0) return sum;
        return sum-2*Math.abs(min);
    }
}