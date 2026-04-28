class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            max=Math.max(max,n);
        }

        int l=0,r=0,n=nums.length;
        int c=0;
        long ans=0;
        while(r<n){
            if(nums[r]==max)c++;
            while(c==k){
                ans+=(n-r);
                if(nums[l]==max)c--;
                l++;
            }
            r++;
        }
        return ans;
    }
}