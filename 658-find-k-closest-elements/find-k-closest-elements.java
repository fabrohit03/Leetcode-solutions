class Pair{
    int first;
    int second;
    Pair(int f, int s){
        first = f;
        second = s;
    }
}
    class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->{
            if(a.second!=b.second){
                return b.second-a.second;
            }
            return b.first-a.first;
        });
        for(int i=0; i<arr.length; i++){
            if(pq.size()<k){
                pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
            }else{
                if(pq.peek().second>Math.abs(arr[i]-x)){
                    pq.poll();
                    pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll().first);
            
        }
        Collections.sort(res);
        return res;
    }
}