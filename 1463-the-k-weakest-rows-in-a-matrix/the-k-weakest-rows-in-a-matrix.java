class Pair{
    int first,second;
    Pair(int f, int s){
        first=f;
        second=s;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->{
            if(a.first!=b.first){
                return b.first-a.first;
            }
            return b.second-a.second;
        });
        int m = mat.length;
        for(int i=0; i<m; i++){
            int count = 0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==1) count++;
                else break;
            }
            pq.add(new Pair(count,i));
            if(pq.size()>k) pq.poll();
        }
        int [] res = new int[k];
        for(int i=k-1; i>=0; i--){
            res[i]=pq.poll().second;
        }
        return res;
    }
}