class Solution {
    public int scoreDifference(int[] nums) {
        int fir=0,sec=0;
        boolean check=true;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)check=!check;
            if(i%6==5)check=!check;
            if(check)fir+=nums[i];
            else sec+=nums[i];
        }
        return fir-sec;
    }
}