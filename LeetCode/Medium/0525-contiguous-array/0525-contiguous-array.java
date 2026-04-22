class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        pre[0]=(nums[0]== 0) ?-1:1;
        for(int i=1;i<n;i++){
            if(nums[i]==0){
                pre[i]=pre[i-1]-1;
            }
            else pre[i]=pre[i-1]+1;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++){
            if(pre[i] == 0)ans=i+1;
            if(map.containsKey(pre[i])){
                ans=Math.max(ans,i-map.get(pre[i]));
            }
            else map.put(pre[i], i);
        }
        return ans;
    }
}