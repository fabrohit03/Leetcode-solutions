class Solution {
    public String frequencySort(String s) {
       StringBuilder ans = new StringBuilder();
       HashMap<Character,Integer>map=new HashMap<>();
       for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);

       }
       List<Character>res = new ArrayList<>(map.keySet());
       res.sort((a,b)->map.get(b)-map.get(a));
       for(char ch:res){
        for(int i=0; i<map.get(ch); i++){
            ans.append(ch);
        }
       }
       return ans.toString();
    }
}