class Solution {
    // private void dfs(int node,List<List<Integer>>adj,boolean[] vis){
    //     vis[node]=true;
    //     for(int it:adj.get(node)){
    //         if(!vis[it]){
    //             vis[it]=true;
    //             dfs(it,adj,vis);
    //         }
    //     }
    // }
    public int findCircleNum(int[][] isConnected) {
        // int v=isConnected.length;
        // List<List<Integer>>adj=new ArrayList<>(); //changing to adjacency list
        // for(int i=0;i<v;i++){
        //     adj.add(new ArrayList<Integer>());
        // } 
        // for(int i=0;i<v;i++){
        //     for(int j=0;j<v;j++){
        //         if(isConnected[i][j]==1 && i!=j){
        //             adj.get(i).add(j);
        //             adj.get(j).add(i);
        //         }
        //     }
        // }
        //     boolean[] vis=new boolean[v];
        //     int c=0;
        //     for(int i=0;i<v;i++){
        //         if(!vis[i]){
        //             c++;
        //             dfs(i,adj,vis);
        //         }
        //     }
    
        // return c;


         //more easy approach
         int v=isConnected.length;
         boolean[] vis=new boolean[v];
         int c=0;

         for(int i=0;i<v;i++){
            if(!vis[i]){
                c++;
                dfs(i,vis,isConnected);
            }
         }
         return c;
    }
    private void dfs(int node,boolean[] vis,int[][] isConnected){
        vis[node]=true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[node][j]==1 && !vis[j]) dfs(j,vis,isConnected);
        }
    }
}