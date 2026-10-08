class Solution {
    public String removeDuplicateLetters(String s) {
        int [] lastIdx = new int[26];
        for(int i=0; i<s.length(); i++){
            lastIdx[s.charAt(i)-'a']=i;
        }
        boolean [] seen = new boolean[26];
        Stack<Character>st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            int curr = s.charAt(i)-'a';
            if(seen[curr]) continue;
            while(st.size()>0 && st.peek()>s.charAt(i) && i<lastIdx[st.peek()-'a']){
                seen[st.peek()-'a']=false;
                st.pop();
            }
            st.push(s.charAt(i));
            seen[curr]=true;
        }
        StringBuilder res = new StringBuilder();
        while(st.size()>0){
            res.append(st.pop());

        }
        return res.reverse().toString();
    }
}