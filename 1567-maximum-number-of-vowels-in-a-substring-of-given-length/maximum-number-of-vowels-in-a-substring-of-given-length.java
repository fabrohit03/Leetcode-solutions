class Solution {
    int isVow(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u') return 1;
        return 0;
    }
    public int maxVowels(String s, int k) {
        int maxvow = 0;
        int curr_vow=0;
        for(int i=0; i<s.length(); i++){
            curr_vow += isVow(s.charAt(i));
            if(i>=k){
                curr_vow -= isVow(s.charAt(i-k));
                
            }
              maxvow = Math.max(maxvow,curr_vow);
        }
        return maxvow;
    }
}