class Solution {
    public int characterReplacement(String s, int k) {
        int low =0;
        int res =0;
        int n = s.length();
        int maxCount =0;
        int [] freq = new int[256];
        for(int high=0; high<n; high++){
            char ch = s.charAt(high);
            freq[ch]++;
            maxCount = Math.max(maxCount,freq[ch]);
            int len = high-low+1;
            if(len-maxCount>k){
                freq[s.charAt(low)]--;
                low++;
            }
            res = Math.max(res,high-low+1);
        }
        return res;
    }
}