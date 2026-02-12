class Solution {
    private void Subset(int[] nums,int i,List<Integer>temp,List<List<Integer>>ans){

        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        Subset(nums,i+1,temp,ans);
        temp.add(nums[i]);
        Subset(nums,i+1,temp,ans);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Subset(nums,0,temp,ans);
        return ans;
    }
}