class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>>ans=new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) == s2.charAt(i)) continue;
            ArrayList<String>temp=new ArrayList<>();

            int j=i;
            while( j<s1.length() && s1.charAt(j)!=s2.charAt(j)){
                j++;
            }
            temp.add(s1.substring(i,j));
            temp.add(s2.substring(i,j));
            i=j-1;
            ans.add(temp);
        }
        return ans;
    }
}