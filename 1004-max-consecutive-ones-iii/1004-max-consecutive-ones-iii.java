class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,c=0,mval=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)c++;
            while(c>k){
                if(nums[l]==0)c--;
                l++;
            }
            mval=Math.max(mval,i-l+1);
        }
        return mval;
    }
}