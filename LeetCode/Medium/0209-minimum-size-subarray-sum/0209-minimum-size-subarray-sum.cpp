class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int n=nums.size();
        int s=0,sum=0,l=INT_MAX;
        for(int e=0;e<n;e++){
            sum+=nums[e];
            while(sum>=target){
                l=min(l,e-s+1);
                sum-=nums[s];
                s++;
            }
        }
       
            return (l!=INT_MAX)? l:0;
    }
};