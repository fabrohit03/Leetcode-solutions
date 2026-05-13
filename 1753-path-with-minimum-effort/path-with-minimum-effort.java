class Solution {
    class Pair{
        int row;
        int col;
        int dist;
        Pair(int row, int col, int dist){
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
    public int minimumEffortPath(int[][] heights) {
       int n = heights.length;
       int m = heights[0].length;
       int [][] res = new int [n][m];
       for(int i=0; i<n ;i++){
        Arrays.fill(res[i],Integer.MAX_VALUE);
       } 
       PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
       int [] x ={1,-1,0,0};
       int [] y ={0,0,1,-1};
       res[0][0]=0;
       pq.offer(new Pair(0,0,0));
       while(!pq.isEmpty()){
        Pair p = pq.poll();
        int row = p.row;
        int col = p.col;
        int dis = p.dist;
        if(row==n-1 && col==m-1){
            return dis;
        }
        if(dis>res[row][col]) continue;
        for(int k=0; k<4; k++){
            int r = row+x[k];
            int c = col+y[k];
            if(r<0 || c<0 || r>=n || c>=m) continue;
            int absDiff = Math.abs(heights[row][col]-heights[r][c]);
            int newWt = Math.max(absDiff,dis);
            if(newWt<res[r][c]){
                res[r][c]=newWt;
                pq.offer(new Pair(r,c,newWt));
            }
        }
       }
       return 0;
    }
}