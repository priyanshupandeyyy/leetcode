class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int mval=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer>m = new HashMap<>();
            int val=0;
            for(int j=i;j<n;j++){
                char a = s.charAt(j);
                if(m.containsKey(a)) break;
                m.put(a,1);
                val++;
                mval=Math.max(val,mval);
            }
        }
        return mval;
    }
}