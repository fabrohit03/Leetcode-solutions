class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [] next = new int[m+1];
        for(int i=n-1; i>=0; i--){
            int [] curr = new int[m+1];
            for(int j=m-1; j>=0; j--){
                if(text1.charAt(i)==text2.charAt(j)){
                    curr[j]=1+next[j+1];
                }else{
                    curr[j] =Math.max(next[j],curr[j+1]);
                }
            }
            next = curr;
        }
        return next[0];
    }
    
}