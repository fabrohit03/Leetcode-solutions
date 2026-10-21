class Solution {
    public int lengthOfLongestSubstring(String s) {
       int res = 0;
       for(int i=0; i<s.length(); i++){
        boolean[] seen = new boolean[128];
        int count = 0;
        for(int j=i; j<s.length(); j++){
            char c = s.charAt(j);
            if(seen[c]){
                break;
            }
            seen[c]=true;
            count++;
            res = Math.max(res,count);
        }
       }
        return res;
    }
}