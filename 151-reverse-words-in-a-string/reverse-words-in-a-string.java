class Solution {
    public String reverseWords(String s) {
    StringBuilder res = new StringBuilder();
     int i = s.length()-1;
     while(i>=0){
        while(i>=0 && s.charAt(i)==' ') i--;
        if(i<0) break;
        int j=i;
        while(j>=0 && s.charAt(j)!=' ') j--;
        if(res.length()>0){
            res.append(" ");
        }
        for(int k=j+1; k<=i; k++){
            res.append(s.charAt(k));
        }
        i=j;
     }
     return res.toString();
    }
}