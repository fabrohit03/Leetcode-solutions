class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len=0;
        for(int i=0; i<s.length(); i++){
             HashSet<Character> map = new HashSet<>();
            for(int j=i; j<s.length(); j++){
                if(map.contains(s.charAt(j))) break;
                map.add(s.charAt(j));
                int len = j-i+1;
                max_len=Math.max(max_len,len);
                
            }
        }
        return max_len;
    }
}