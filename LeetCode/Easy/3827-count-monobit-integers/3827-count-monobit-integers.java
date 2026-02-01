class Solution {
    public int countMonobit(int n) {
        int c=0;
        for(int i=0;i<=n;i++){
            String s=Integer.toBinaryString(i);
            boolean flag=true;
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(j)!=s.charAt(j+1)){
                    flag=false;
                    break;
                }
            }
            if(flag)c++;
        }
        return c;
    }
}