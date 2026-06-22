class Solution {
    public int minStartValue(int[] nums) {
        int prefix=0;
        int val=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            val=Math.min(prefix,val);
        }
        if(val<0)val=Math.abs(val)+1;
        else if(val>=0)val=1;
        return val;
    }
}