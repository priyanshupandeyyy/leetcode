class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int l=0,c=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[l]=nums[i];
                l++;
            }
            else c++;
        }
        for(int i=l;i<n;i++){
            nums[i]=0;
        }
    }
}