class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int a=0,b=-1;
        int[] arr=nums.clone();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=nums[i]){
                a=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=nums[i]){
                b=i;
                break;
            }
        }
        return b-a+1;
    }
}