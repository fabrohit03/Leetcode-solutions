class Solution {
    int [] x = {-1,1,0,0};
    int [] y = {0,0,-1,1};
    boolean valid(int i, int j, int n, int m){
        return(i>=0 && i<n && j>=0 && j<m);
    }

    public int orangesRotting(int[][] grid) {
        Queue<int[]>q=new LinkedList<>();

        int n = grid.length;
        int m = grid[0].length;
        int fresh =0;
        int time =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        while(!q.isEmpty()&&fresh>0){
            time++;
            int size = q.size();
            for(int s=0;s<size;s++){
                int [] p = q.poll();
                int row =p[0];
                int col=p[1];
                for(int k=0;k<4;k++){
                    int newRow = row+x[k];
                    int newCol = col+y[k];
                    if(valid(newRow,newCol,n,m)&&grid[newRow][newCol]==1){
                        grid[newRow][newCol]=2;
                        q.add(new int []{newRow,newCol});
                        fresh--;
                    }
                }
            }
        }
        return (fresh>0) ? -1 : time; 
    }
}