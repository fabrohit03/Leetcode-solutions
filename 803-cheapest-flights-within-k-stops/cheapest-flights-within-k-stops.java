class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int [] res = new int [n];
        Arrays.fill(res,(int)1e8);
        res[src]=0;
        for(int i =0; i<=k; i++){
            int [] temp = Arrays.copyOf(res,n);
            for(int j =0; j<flights.length; j++){
                int u = flights[j][0];
                int v = flights[j][1];
                int wt = flights[j][2];
                if(res[u]!=(int)1e8 && temp[v]>res[u]+wt){
                    temp[v] = res[u]+wt;
                }
            }
            res= temp;
        }
     
        return res[dst]==(int)1e8 ? -1 :res[dst] ;
    }
}