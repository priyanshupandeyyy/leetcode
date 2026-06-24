class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        int n=blocks.length();
        int l=0,r=0,c=0;
        
        while(r<n){
            if(blocks.charAt(r)=='W')c++;

            if(r-l+1==k){
                min=Math.min(min,c);
                if(blocks.charAt(l)=='W')c--;
                l++;
            }
            r++;
        }
        return min;
    }
}