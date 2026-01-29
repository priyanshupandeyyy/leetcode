class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int[]psum=new int[n];
        int[]ssum=new int[n];
        psum[0]=1;
        ssum[n-1]=1;
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            ssum[i]=ssum[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            nums[i]=psum[i]*ssum[i];
        }
        return nums;
    }
}