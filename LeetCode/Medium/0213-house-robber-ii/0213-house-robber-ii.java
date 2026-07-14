class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1)return nums[0];
        int[] arr1=Arrays.copyOfRange(nums,0,n-1);
        int[] arr2=Arrays.copyOfRange(nums,1,n);
        
        return Math.max(rob2(arr1),rob2(arr2));
    }

    private int rob2(int[] arr){
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(arr,n-1,dp);
    }

    private int solve(int[] arr,int n,int[] dp){
        if(n==0)return arr[0];
        if(n==1)return Math.max(arr[0],arr[1]);
        
        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=Math.max(arr[n]+solve(arr,n-2,dp),solve(arr,n-1,dp));
        return dp[n];
    }
}