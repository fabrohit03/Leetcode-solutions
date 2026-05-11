class Solution {
    static class Pair{
        int node;
        int dist;
        Pair(int node , int dist){
            this.node = node;
            this.dist = dist;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>>adj = new ArrayList<>();
        for(int i=0; i<=n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length ;i++){
            int u = times[i][0];
            int v = times[i][1];
            int wt = times[i][2];
            adj.get(u).add(new Pair(v,wt));
        }
        int [] dist = new int [n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
        pq.offer(new Pair(k,0));
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int d = p.dist;
            int node = p.node;
            if(d>dist[node]) continue;
            for(Pair nbr : adj.get(node)){
                int adjNode = nbr.node;
                int wt = nbr.dist;
                if(d+wt<dist[adjNode]){
                    dist[adjNode]=wt+d;
                    pq.offer(new Pair(adjNode, dist[adjNode]));
                }
            }
        }
        int ans = 0;
        for(int i=1 ; i<=n ;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            ans = Math.max(ans,dist[i]);
        }
        return ans;
    }
}