class Pair{
    int first;
    String second;
    Pair(int f, String s){
        first = f;
        second = s;
    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->{
            if(a.first!=b.first)
                return a.first-b.first;
            return b.second.compareTo(a.second);
        }) ;
        HashMap<String, Integer>map = new HashMap<>();
        for(String word: words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
            for(Map.Entry<String,Integer>entry:map.entrySet()){
                pq.add(new Pair(entry.getValue(), entry.getKey()));
                if(pq.size()>k){
                    pq.poll();
                }
            }

            List<String> ans = new ArrayList<>();
            while(!pq.isEmpty()){
                ans.add(pq.poll().second);

            }
        Collections.reverse(ans);
        return ans;
    }
}