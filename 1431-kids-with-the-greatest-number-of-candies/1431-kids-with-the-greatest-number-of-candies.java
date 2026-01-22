class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        ArrayList<Boolean>list = new ArrayList<>();
        int max=c[0];
        for(int i=1;i<c.length;i++){
            max=Math.max(max,c[i]);
        }
        for(int i=0;i<c.length;i++){
            if(c[i]+e>=max)list.add(true);
            else list.add(false);
        }
        return list;
    }
}