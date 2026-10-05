class Solution {
    public void reverseString(char[] s) {
    StringBuilder str = new StringBuilder();
    for(char ch:s){
        str.append(ch);
    }
   
    str.reverse();
    for(int i=0; i<s.length; i++){
        s[i]=str.charAt(i);
    }
    }   
}