class Solution {
public:
void firstPos(vector<int> &nums,int target,int &first){
    int n=nums.size();
    int left=0;
    int right=n-1;
    while(left<=right){
        int mid =left+(right-left)/2;
        if(nums[mid]==target){
            first=mid;
            right=mid-1;
        }
        else if(nums[mid]>target){
            right=mid-1;

        }else{
            left=mid+1;
        }
    }
}
void lastPos(vector<int> &nums,int target,int &first){
    int n=nums.size();
    int left=0;
    int right=n-1;
    while(left<=right){
        int mid =left+(right-left)/2;
        if(nums[mid]==target){
            first=mid;
            left=mid+1;
        }
        else if(nums[mid]>target){
            right=mid-1;

        }else{
            left=mid+1;
        }
    }
}

    vector<int> searchRange(vector<int>& nums, int target) {
        int firstAns=-1;
        int lastAns=-1;
        firstPos(nums,target,firstAns);
        lastPos(nums,target,lastAns);       
        vector<int> result(2);
        result[0]=firstAns;
        result[1]=lastAns;
        return result;
    }
};