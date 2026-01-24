class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[l]!=nums[i]){
                l++;
                nums[l]=nums[i];
                c++;
            }
            else{
                nums[l]=nums[i];
            }
        }
        return c+1;
    }
}