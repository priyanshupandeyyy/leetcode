class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int[] pregcd=new int[n];
        pregcd[0]=nums[0];

        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);

            pregcd[i]=gcd(nums[i],max);
        }

        Arrays.sort(pregcd);
        long sum=0;
        int i=0,j=n-1;

        while(i<j){
            sum+=(long)gcd(pregcd[i],pregcd[j]);
            i++;
            j--;
        }
        return sum; 
    }

    private int gcd(int a,int b){
        return (b==0)? a:gcd(b,a%b);
    }
}