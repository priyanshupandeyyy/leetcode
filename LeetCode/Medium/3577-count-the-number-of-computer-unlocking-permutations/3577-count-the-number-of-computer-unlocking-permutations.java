class Solution {
    public int countPermutations(int[] c) {
        int n=c.length-1;
        int x=c[0];
        int cnt=0;
        for(int a:c){
            if(a==x) cnt++;
            if(a<x) cnt++;
        }
        if(cnt>1) return 0;
        int MOD =(int) 1e9 + 7;
        long ans=1;
        while(n>1){
            ans=(ans*n)%MOD;
            n--;
        }
        return (int)ans;
    }
}