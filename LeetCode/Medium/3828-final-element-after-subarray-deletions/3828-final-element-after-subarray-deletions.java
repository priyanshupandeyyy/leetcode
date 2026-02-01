class Solution {
    public int finalElement(int[] nums) {
        int n=nums.length;
        if(nums[0]<nums[n-1])return nums[n-1];
        else return nums[0];
        
    }
}