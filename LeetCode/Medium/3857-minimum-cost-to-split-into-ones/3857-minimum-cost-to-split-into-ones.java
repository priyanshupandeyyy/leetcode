class Solution {
    public int minCost(int n) {
        if(n==1)return 0;
        return 1*(n-1)+minCost(n-1);
    }
}