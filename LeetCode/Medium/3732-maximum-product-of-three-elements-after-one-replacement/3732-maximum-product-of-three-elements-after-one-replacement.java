class Solution {
    public long maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long a=Math.abs(1L*nums[n-1]*nums[n-2]*100000);
        long b=Math.abs(1L*nums[0]*nums[1]*100000);
        long c=Math.abs(1L*nums[0]*nums[n-1]*100000);
        return Math.max(a,Math.max(b,c));
    }
}