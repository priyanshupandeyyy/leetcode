class Solution {
    public int climbStairs(int n) {
        // int[] dp=new int[3];
        // Arrays.fill(dp,-1);
        // return solve(n,dp);

        //Space Optimization
        if(n<=1)return 1;
        if(n==2)return 2;

        int[] dp=new int[3];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++){
            dp[0]=dp[1];
            dp[1]=dp[2];
            dp[2]=dp[1]+dp[0];
        }
        return dp[2];
    }

    // private int solve(int n,int[] dp){
    //     if(n<=1)return 1;

    //     if(dp[n]!=-1)return dp[n];
    //     dp[n]=solve(n-1,dp)+solve(n-2,dp);
    //     return dp[n];
    // }
}