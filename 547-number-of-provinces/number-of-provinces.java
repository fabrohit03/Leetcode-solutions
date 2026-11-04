class Solution {
    void dfs(int i, int[][] isConnected ,boolean[] vis){
        vis[i]=true;
        for(int j=0; j<isConnected.length; j++){
            if(isConnected[i][j]==1 && !vis[j]){
                dfs(j,isConnected,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[]vis=new boolean[n];
        for(int i=0; i<n; i++){
            if(!vis[i]){
                dfs(i,isConnected,vis);
                count++;
            }
        }
        return count;
    }
}