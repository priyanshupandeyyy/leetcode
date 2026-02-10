class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        Stack<Integer>st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty()&& st.peek()<=nums[i%n]){
                st.pop();
            }
            if(!st.isEmpty()&&st.peek()>nums[i%n])ans[i]=st.peek();
            if(st.isEmpty())ans[i]=-1;
            st.push(nums[i%n]);
        }
        int[] nge=new int[n];
        for(int i=0;i<n;i++){
            nge[i]=ans[i];
        }
        return nge;
    }
}