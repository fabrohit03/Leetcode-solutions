class Solution {
    boolean isCycleDfs(int[][] edges, int src,boolean[] vis, boolean[] path){
        vis[src]=true;
        path[src]=true;
        for(int i=0; i<edges.length; i++){
            int v = edges[i][0];
            int u = edges[i][1];

            if(u==src){
                if(!vis[v]){
                    if(isCycleDfs(edges,v,vis,path)){
                        return true;
                    }
                }else if(path[v]){
                    return true;
                }
            }
        }
        path[src]=false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] vis = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        for(int i=0; i<numCourses; i++){
            if(!vis[i]){
                if(isCycleDfs(prerequisites,i,vis,path)){
                    return false;
                }
            }
        }
        return true;
    }
}