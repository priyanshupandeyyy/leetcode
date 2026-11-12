class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int milen=1,mdlen=1;

        for(int i=0;i<nums.length-1;i++){
            int ilen=1;
            while(i<nums.length-1 && nums[i]<nums[i+1]){
                ilen++;
                i++;
            }
            milen=Math.max(milen,ilen);
        }

        for(int i=0;i<nums.length-1;i++){
            int dlen=1;
            while(i<nums.length-1 && nums[i]>nums[i+1]){
                dlen++;
                i++;
            }
            mdlen=Math.max(mdlen,dlen);
        }
        return Math.max(milen,mdlen);
    }
}