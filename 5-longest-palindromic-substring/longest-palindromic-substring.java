class Solution {
    String newStr(String s, int left, int right){
       int n = s.length();
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<=1) return s;
        String max_str = s.substring(0,1);
        for(int i=0; i<n-1; i++){
            String odd = newStr(s,i,i);
            String even = newStr(s,i,i+1);
            if(odd.length()>max_str.length()){
                max_str=odd;
            }
            if(even.length()>max_str.length()){
                max_str=even;
            }

        }
        return max_str;
    }
}