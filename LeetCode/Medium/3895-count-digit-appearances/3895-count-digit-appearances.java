class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
                int rem=n%10;
                n/=10;
                if(rem==digit)ans++;
            }
        }
        return ans;
    }
}