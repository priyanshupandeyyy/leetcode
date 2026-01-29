class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        int min=1;
        int n=piles.length;
        for(int i=1;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        
        if(n==h)return max;
        while(min<max){
            int c=0;
            int mid=min+(max-min)/2;
            for(int i=0;i<n;i++){
                if(piles[i]%mid==0)c+=piles[i]/mid;
                else c+=(piles[i]/mid)+1;
            }
            if(c>h)min=mid+1;
            else if(c<=h){
                max=mid;
            }
        }
        return min;
    }
}