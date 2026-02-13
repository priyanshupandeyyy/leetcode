class Solution {
    public void check(int[] nums,int i,List<Integer>temp,List<List<Integer>>ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[i]); //take
        check(nums,i+1,temp,ans);
        temp.remove(temp.size()-1);

        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        check(nums,i+1,temp,ans); //not take
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);

        check(nums,0,temp,ans);
        return ans;
    }
}