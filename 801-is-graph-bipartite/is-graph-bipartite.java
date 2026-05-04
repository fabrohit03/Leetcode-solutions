class Solution {
    boolean res = true;
    void dfs(int [][] graph,int node, int c, int[] colors){
        colors[node]=c;
        for(int nbr: graph[node]){
            if(colors[nbr]!=-1 && colors[nbr]==c){
                res = false;
                return;
            }
            if(colors[nbr]==-1){
                dfs(graph,nbr,1-c,colors);
            }
        }
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        Arrays.fill(colors,-1);
        for(int i=0;i<n;i++){
            if(colors[i]==-1){
                dfs(graph,i,0,colors);
            }
        }
        return res;
    }
}