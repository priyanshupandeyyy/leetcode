class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int l=0,r=0,prod=1;
        int c=0;
        while(r<nums.length){
            prod*=nums[r];
            while(prod>=k){
                prod/=nums[l];
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}