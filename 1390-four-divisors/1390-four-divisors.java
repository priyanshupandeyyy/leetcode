class Solution {
    public int sumFourDivisors(int[] nums) {
        int tsum = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = 1, sum = 0, cnt = 0;
            if (nums[i] >= 6) {
                while (j <= Math.sqrt(nums[i])) {
                    if (nums[i] % j == 0) {
                        sum += j;
                        cnt++;
                        if(j!=nums[i]/j){
                            sum += (nums[i] / j);
                            cnt++;
                        }
                        
                    }
                    if (cnt > 4)
                            break;
                    
                j++;
                }
                if (cnt == 4)
                        tsum += sum;
            }
        }
        return tsum;
    }
}