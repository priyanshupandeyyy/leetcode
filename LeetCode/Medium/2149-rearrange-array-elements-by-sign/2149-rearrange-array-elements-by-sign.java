class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int x=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[x++]=nums[i];
            }
        }
        int y=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg[y++]=nums[i];
            }
        }
        x=0;
        y=0;
        nums[0]=pos[x++];
        for(int i=1;i<n;i++){
            if(i%2==0){
                nums[i]=pos[x++];
            }
            else nums[i]=neg[y++];
        }
        return nums;
    }
}