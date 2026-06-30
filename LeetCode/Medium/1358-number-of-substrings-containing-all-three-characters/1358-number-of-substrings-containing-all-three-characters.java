class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int l=0,r=0,cnt=0;

        while(r<n){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.size()==3){
                cnt+=(n-r);
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);

                if(map.get(s.charAt(l))==0)map.remove(s.charAt(l));
                l++;
            }
            r++;
        }
        return cnt;
    }
}