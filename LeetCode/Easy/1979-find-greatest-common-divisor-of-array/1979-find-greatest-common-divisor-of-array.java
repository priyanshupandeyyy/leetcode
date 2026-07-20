class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }

        return gcd(min,max);
    }

    private int gcd(int a,int b){
      return (b==0)?  a: gcd(b,a%b);
    }
}