class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int psum=nums[0];
        int maxsum=nums[0];
        int total=nums[0];
        for(int i=1;i<n;i++){
            psum=Math.max(psum+nums[i],nums[i]);
            maxsum=Math.max(maxsum,psum);
            total+=nums[i];
        }
        
        int nsum=nums[0];
        int minsum=nums[0];
        for(int i=1;i<n;i++){
            nsum=Math.min(nums[i],nsum+nums[i]);
            minsum=Math.min(minsum,nsum);
        }
        if(total==minsum)return maxsum;
        return Math.max(maxsum,total-minsum);
    }
}