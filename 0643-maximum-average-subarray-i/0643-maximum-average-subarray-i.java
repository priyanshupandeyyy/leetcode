class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=k-1,sum=0;
        for(int i=l;i<=r;i++){
            sum+=nums[i];
        }
        int Maxsum=sum;
        while(r<n-1){
            sum-=nums[l];
            l++;
            r++;
            sum+=nums[r];
            Maxsum=Math.max(sum,Maxsum);

        }
        return (double)Maxsum/k;
    }
}