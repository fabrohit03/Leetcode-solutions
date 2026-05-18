class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int low = grid[0][0];
        int high = grid[0][0];
        for(int i =0; i<n ;i++){
            for(int j =0 ; j<m; j++){
                high = Math.max(high,grid[i][j]);
            }
        }
        int res = high;
        while(low<=high){
            int guess = (low+high)/2;
            if(bfs(grid,guess)){
                res = guess;
                high = guess-1;
            }else{
                low = guess+1;
            }
            
        }
       
        return res;
    }
     private boolean bfs(int [][] grid,int money){
            int n = grid.length;
            int m = grid[0].length;
            if(grid[0][0]>money) return false;
            int [][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
            boolean [][] visited = new boolean[n][n];
            Queue<int[]>q = new LinkedList<>();
            q.offer(new int[]{0,0});
            visited[0][0]=true;
            while(!q.isEmpty()){
                int [] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                if(x==n-1 && y==m-1) return true;
                for(int[] d : dirs){
                    int nx =x+d[0];
                    int ny = y+d[1];
                    if(nx>=0 && ny>=0 && nx<n && ny<m && !visited[nx][ny] && grid[nx][ny]<=money){
                        visited[nx][ny]=true;
                        q.offer(new int[]{nx,ny});
                    }
                }
            }
            return false;
        }
}