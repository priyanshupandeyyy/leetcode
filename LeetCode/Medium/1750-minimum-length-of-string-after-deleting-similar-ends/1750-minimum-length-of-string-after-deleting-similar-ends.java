class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char pref=s.charAt(i);
            char suff=s.charAt(j);

            if(pref==suff){
                while(i<=j && s.charAt(i)==pref)i++;
                while(i<=j && s.charAt(j)==suff)j--;
            }
            else break;
        }
        return j-i+1;
    }
}