class Solution {
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(dp,n);
    }

    private int solve(int[] dp,int i){
        if(i==0) return 0;
        if(i==1 || i==2) return 1;
        if(dp[i]!=-1)return dp[i];
        return dp[i]=solve(dp,i-1)+solve(dp,i-2)+solve(dp,i-3);
    }
}