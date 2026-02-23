class Solution {
    private boolean isprime(int n){
        if(n<2)return false;
        int i=2;
        while(i*i<=n){
            if(n%i==0)return false;
            i++;
        }
        return true;
    }

    private boolean ispalindrome(int n){
        String s=String.valueOf(n);
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
    public int primePalindrome(int n) {
        while(true){
            if(isprime(n)&&ispalindrome(n)){
                break;
            }
            else n++;

            if(10000000<= n && n<=100000000)
                n = 100000000;
        }
        return n;
    }
}