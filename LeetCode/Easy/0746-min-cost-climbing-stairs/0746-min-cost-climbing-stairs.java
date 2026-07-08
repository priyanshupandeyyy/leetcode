class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(cost,n,dp);
    }

    private int solve(int[] cost,int n, int[] dp){
        if(n<=1)return 0;
        if(dp[n]!=-1)return dp[n];
        dp[n]=Math.min(solve(cost,n-1,dp)+cost[n-1],solve(cost,n-2,dp)+cost[n-2]);
        return dp[n];
    }
}