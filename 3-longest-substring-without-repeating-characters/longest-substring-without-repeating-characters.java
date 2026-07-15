class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low =0;
        int n = s.length();
        int res =0;
        HashMap<Character,Integer>freq = new HashMap<>();
        for(int high=0; high<n; high++){
            char ch = s.charAt(high);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            while(freq.get(ch)>1){
                char lCh = s.charAt(low);
                freq.put(lCh,freq.get(lCh)-1);
                if(freq.get(lCh)==0){
                    freq.remove(lCh);
                }
                low++;
            }
            res = Math.max(res,high-low+1);
        }
        return res;
    }
}