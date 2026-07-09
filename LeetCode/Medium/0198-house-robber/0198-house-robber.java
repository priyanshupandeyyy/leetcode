class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums,n-1,dp);
    }

    private int solve(int[] nums,int n, int[] dp){
        if(n==0) return nums[0];
        if(n==1)return Math.max(nums[0],nums[1]);
        if(dp[n]!=-1)return dp[n];

        dp[n]=Math.max(solve(nums,n-1,dp),nums[n]+solve(nums,n-2,dp));
        return dp[n];
    }

}