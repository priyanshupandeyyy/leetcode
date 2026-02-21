class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]>q=new PriorityQueue<>((a,b)->{
           if(a[0]==b[0])return a[1]-b[1];
           return  a[0]-b[0];
           });

        for(int i=0;i<arr.length;i++){
            q.add(new int[]{Math.abs(arr[i]-x),arr[i]});
        }

        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(q.poll()[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}