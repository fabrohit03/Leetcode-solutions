class Solution {
    int[][]dp;
    boolean solve(String s, int l, int r){
        if(l>=r) return true;
        if(dp[l][r] !=-1){
            return dp[l][r]==1;
        }
        if (s.charAt(l) == s.charAt(r)) {
        boolean result = solve(s, l + 1, r - 1);
        dp[l][r] = result ? 1 : 0;
        return result;
        }
        dp[l][r]=0;
        return false;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        dp=new int[n][n];
          for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }
        int max_len = 0;
        int startingIdx = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(solve(s,i,j)){
                    if(j-i+1>max_len){
                        startingIdx=i;
                        max_len=j-i+1;
                    }
                }
            }
        }
        return s.substring(startingIdx,startingIdx+max_len);
    }
}