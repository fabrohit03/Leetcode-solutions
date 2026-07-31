class Pair{
    int first;
    int second;
    Pair(int f, int s){
        first = f;
        second = s;
    }
}

class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair>pq = new PriorityQueue<>(
            (a,b)-> Integer.compare(a.first, b.first)
        );
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,(map.getOrDefault(num,0)+1));
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            pq.add(new Pair(entry.getValue(), entry.getKey()));
            if(pq.size()>k){
                pq.poll();
            }
        }

        int [] ans = new int[k];
        int ind = 0;
        while(!pq.isEmpty()){
            ans[ind++]=pq.poll().second;
        }
        return ans;
    }
}