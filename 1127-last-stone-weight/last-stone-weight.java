class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue <Integer> pq= new PriorityQueue<>(
        (a,b)->b-a
    );

   for(int stone:stones){
    pq.add(stone);
   }

   while(pq.size()>1){
    int p1=pq.poll();
    int p2=pq.poll();
    if(p1==p2){
        if(pq.isEmpty()) return 0;

        continue;
    }
    else{
        p1=p1-p2;
        pq.add(p1);
    }
   }
    int res=pq.poll();
    return res;
    }
}