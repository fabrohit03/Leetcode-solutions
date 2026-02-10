class Pair{
    int first;
    char second;
    Pair(int f,char s){
        first=f;
        second=s;
    }
}

class Solution {
    public String reorganizeString(String s) {
    PriorityQueue<Pair> pq=new PriorityQueue<>(
        (a,b)->b.first-a.first
    );

    HashMap<Character,Integer> map= new HashMap<>();
    for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);

    }
    
    for(Map.Entry<Character,Integer>entry:map.entrySet()){
        pq.add(new Pair(entry.getValue(),entry.getKey()));
    }


    StringBuilder res= new StringBuilder();
    while(pq.size()>1){
        Pair p1=pq.poll();
        Pair p2=pq.poll();

        res.append(p1.second);
        res.append(p2.second);

        p1.first--;
        p2.first--;

        if(p1.first>0) pq.add(p1);
        if(p2.first>0) pq.add(p2);
    }

    while(!pq.isEmpty()){
        Pair last=pq.poll();
        if(last.first>1) return "";
        res.append(last.second);
    }
    return res.toString();
    }
}
