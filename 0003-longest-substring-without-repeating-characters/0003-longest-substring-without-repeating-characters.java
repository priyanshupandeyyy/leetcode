class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int mval=0;
        int l=0;
        HashMap<Character,Integer>m = new HashMap<>();
        for(int i=0;i<n;i++){
            char a =s.charAt(i);
            if(m.containsKey(a)) l=Math.max(l,m.get(a)+1);
            m.put(a,i);
            mval=Math.max(mval,i-l+1);
        }
        return mval;
    }
}