class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int maxq=0;
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int x=0;

        for(int i=0;i<towers.length;i++){
            int dis=Math.abs(towers[i][0]-center[0])+Math.abs(towers[i][1]-center[1]);
            if(dis<=radius && towers[i][2]>maxq){
                ans[0]=towers[i][0];
                ans[1]=towers[i][1];
                maxq=Math.max(maxq,towers[i][2]);
                x=i;
            }
            else if(dis<=radius && towers[i][2]==maxq){
                if(towers[x][0]<=towers[i][0]){
                    ans[0]=towers[x][0];
                    ans[1]=towers[x][1];
                }
                else{
                    ans[0]=towers[i][0];
                    ans[1]=towers[i][1];
                }
            }
        }
        return ans;
    }
}