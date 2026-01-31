class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(s.length()==0||t.length()==0)return false;
        while(i<s.length()&&j<t.length()){
            char a=s.charAt(i);
            char b=t.charAt(j);
            if(a==b){
                i++;
                j++;
            }
            else if(a!=b)j++;
            if(i==s.length())return true;
        }
        return false;
    }
}