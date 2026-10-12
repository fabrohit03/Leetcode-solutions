class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int j = 0;
        int res = 0;
        HashMap<Character,Integer>freq = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            while(freq.get(ch)>1){
                char leftChar = s.charAt(j);
                freq.put(leftChar,freq.get(leftChar)-1);
                if(freq.get(leftChar)==0) freq.remove(leftChar);
                j++;
            }
            res = Math.max(res,i-j+1);
        }
        return res;
    }
}