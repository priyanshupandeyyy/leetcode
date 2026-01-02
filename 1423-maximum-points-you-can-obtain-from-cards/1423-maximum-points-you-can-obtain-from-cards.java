class Solution {
    public int maxScore(int[] cP, int k) {
        int n=cP.length;
        int l=0,r=n-k-1;
        int totsum=0,wsum=0;
        for(int i=0;i<n;i++){
            totsum+=cP[i];
        }
        
        for(int i=l;i<=r;i++){
            wsum+=cP[i];
        }
        int ans=totsum-wsum;
        while(r<n-1){
            wsum-=cP[l];
            l++;
            r++;
            wsum+=cP[r];
            ans=Math.max(ans,totsum-wsum);
        }
        return ans;
    }
}