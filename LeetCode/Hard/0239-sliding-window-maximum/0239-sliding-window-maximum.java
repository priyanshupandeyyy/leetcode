class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n=nums.length;
        int[]ans=new int[n-k+1];
        int x=0; //index for ans;

        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.removeLast();
            }

            dq.addLast(i);
            if(i>=k-1){
                ans[x++]=nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}