class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length,c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1)c++;
        }
    int l=0,r=c-1,zero=0,mzero;
    for(int i=0;i<c;i++){
        if(nums[i]==0)zero++;
    }
    mzero=zero;
    while(r<2*n-1){
        if(nums[l%n]==0){
            zero--;
        }
        l++;
        r++;
        if(nums[r%n]==0)zero++;
        mzero=Math.min(mzero,zero);
    }
    return mzero;
}
}