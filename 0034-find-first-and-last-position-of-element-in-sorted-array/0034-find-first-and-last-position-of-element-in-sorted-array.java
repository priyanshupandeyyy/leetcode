class Solution {
   private int firstocc(int[] nums,int target){
        int low=0,first=-1;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else high=mid-1;
        }
        return first;
    }
   private int lastocc(int[] nums,int target){
        int low=0,last=-1;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)low=mid+1;
            else high=mid-1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {

        return new int[]{firstocc(nums,target),lastocc(nums,target)};
    }
}