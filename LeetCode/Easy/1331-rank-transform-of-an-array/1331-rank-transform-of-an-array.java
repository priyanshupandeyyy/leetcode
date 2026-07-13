class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted=arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            
            if(i==0)map.put(sorted[i],i+1);
            if(!map.containsKey(sorted[i])) map.put(sorted[i],map.get(sorted[i-1])+1);
        }

        int[] ans=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }

        return ans;
    }
}