class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,r=0,c=0;
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        while(r<n){
            char a=s.charAt(r);
            map.put(a,map.getOrDefault(a,0)+1);

            while(map.size()==3){
                c+=(n-r);
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0)map.remove(s.charAt(l));
                l++;
            }
            r++;
        }
        return c;
    }
}