class Solution {
    public int maxScore(int[] card, int k) {
        int n=card.length;
        int sum=0;
        for(int i=n-k;i<n;i++){
            sum+=card[i];
        }
        int msum=sum;
        int i=0;
        while(k-->0){
            sum+=card[i++];
            sum-=card[n-k-1];
            msum=Math.max(sum,msum);
        }
        return msum;
    }
}