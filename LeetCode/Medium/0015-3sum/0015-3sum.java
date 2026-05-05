class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);

        for(int k=0;k<n-2;k++){
            if(k>0 && nums[k-1]==nums[k])continue;
            int target=-nums[k];
            int j=n-1,i=k+1;

            while(i<j){
                if(nums[i]+nums[j]>target)j--;
                else if(nums[i]+nums[j]<target)i++;
                else{
                    List<Integer>temp=new ArrayList<>();
                    while(i<j && nums[i]==nums[i+1])i++;
                    while(i<j && nums[j]==nums[j-1])j--;
                    
                    temp.add(-target);
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    ans.add(temp);
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}