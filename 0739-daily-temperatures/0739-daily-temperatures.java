class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int[] arr=new int[n];
        for(int i=0;i<t.length-1;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                c++;
                if(t[j]>t[i]) break;
                if(j==n-1){
                    c=0;
                    break;
                }
            }
            arr[i]=c;
        }
        arr[n-1]=0;
        return arr;
    }
}