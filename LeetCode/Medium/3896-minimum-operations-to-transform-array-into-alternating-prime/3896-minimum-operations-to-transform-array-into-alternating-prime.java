class Solution {
    private boolean isPrime(int n){
        if(n<=1)return false;

        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            while(i%2==0 && !isPrime(nums[i])){
                nums[i]++;
                ans++;
            }

            while(i%2!=0 && isPrime(nums[i])){
                nums[i]++;
                ans++;
            }
        }
        return ans;
    }
}