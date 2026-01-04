class Solution {
    public int sumFourDivisors(int[] nums) {
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            int j=2,cnt=1,sum=1;
            while(j<=nums[i]){
                if(nums[i]%j==0){
                    sum+=j;
                    cnt++;
                    if(cnt>4)break;
                }
                j++;
            }
            if(cnt==4)tsum+=sum;
        }
        return tsum;
    }
}