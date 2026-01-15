class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> have = new HashMap<>();
        int n= ransomNote.length();
        int m= magazine.length();
        for (int i=0;i<n;i++){
            char ch =ransomNote.charAt(i);
            need.put(ch,need.getOrDefault(ch,0)+1);
             }

        for(int j=0;j<m;j++){
            char ch =magazine.charAt(j);
            have.put(ch,have.getOrDefault(ch,0)+1);
        }
        for(char ch : need.keySet()){
            if(have.getOrDefault(ch,0)<need.get(ch)){
                return false;
            }
        }
        return true;
    }
}