class Solution {
    public int characterReplacement(String s, int k) {
       int freq[] = new int[256];
       int n = s.length();
       int res =0;
       int j=0;
       int maxCount =0;
       for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        freq[ch]++;
        maxCount = Math.max(maxCount,freq[ch]);
        int len = i-j+1;
        if(len-maxCount>k){
            freq[s.charAt(j)]--;
            j++;
            len = i - j + 1;
        }

        res = Math.max(res,len);
       }
       return res;
    }
}