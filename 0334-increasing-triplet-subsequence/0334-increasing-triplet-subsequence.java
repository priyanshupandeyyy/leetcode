class Solution {
    public boolean increasingTriplet(int[] arr) {
        int n = arr.length;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<first) first=arr[i];
            else if(arr[i]<second)second = arr[i];
            else return true;
        }
        return false;
    }
}