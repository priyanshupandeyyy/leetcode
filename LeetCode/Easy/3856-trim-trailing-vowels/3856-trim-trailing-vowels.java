class Solution {
    public String trimTrailingVowels(String s) {
        for(int i=s.length()-1;i>=0;i--){
            char a=s.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                continue;
            }
            else return s.substring(0,i+1);
        }
        return "";
    }
}