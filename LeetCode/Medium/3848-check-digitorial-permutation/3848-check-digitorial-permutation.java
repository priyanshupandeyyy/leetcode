class Solution {
    private int fact(int n){
        if(n==0)return 1;
        return n*fact(n-1);
    }
    public boolean isDigitorialPermutation(int n) {
        int sum=0;
        int x=Math.abs(n);
        while(x>0){
            int a=x%10;
            sum+=fact(a);
            x/=10;
        }
        int[] check=new int[10];
        int y=Math.abs(n);
        while(y>0){
            check[y%10]++;
            y/=10;
        }
        y=sum;
        while(y>0){
            check[y%10]--;
            y/=10;
        }
        for(int i=0;i<check.length;i++){
            if(check[i]!=0)return false;
        }
        return true;
    }
}