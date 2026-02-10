class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0)list.add(nums[i]);
        }

        int n=list.size();
        if(n==0)return nums;
        k = k % n;
        int[] pos=new int[n];
        for(int i=0;i<n;i++){
            pos[(i-k+n)%n]=list.get(i);
        }
        
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0)nums[i]=pos[x++];
        }
        return nums;
    }
}