class Solution {
    public int[] nextGreaterElements(int[] arr) {
         int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=i+1;j<=i+arr.length-1;j++){
                int idx=j%arr.length;
                if(arr[idx]>arr[i]){
                    ans[i]=arr[idx];
                    found=true;
                    break;
                }
            }
            if(!found)ans[i]=-1;
            
        }
        return ans;
    }
}