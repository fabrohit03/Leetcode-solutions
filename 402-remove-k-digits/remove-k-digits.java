class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st =new Stack<>();
       
        if(num.length()==k) return "0";
        
        for(char ch:num.toCharArray()){
            
            
           while(!st.isEmpty() && k>0 && st.peek()>ch){
               st.pop();
               k--;
            }
           
            st.push(ch);
           
        }
         while(k>0 && !st.isEmpty()){
                st.pop();
                k--;
            }
        StringBuilder res = new StringBuilder();
        for(char c:st){
            res.append(c);
        }
        while(res.length()>0 && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }
        return res.length()==0? "0":res.toString();
    }
}