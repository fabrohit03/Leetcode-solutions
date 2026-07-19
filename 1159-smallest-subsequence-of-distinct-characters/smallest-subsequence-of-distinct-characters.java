class Solution {
    public String smallestSubsequence(String s) {
      int [] freq = new int[26];
      boolean [] visited = new boolean[26];
      Stack<Character> st = new Stack<>();

      for(char ch : s.toCharArray()){
        freq[ch-'a']++;
      }
    
      for(char ch : s.toCharArray()){
        freq[ch-'a']--;
      
      if(visited[ch-'a']){
        continue;
      }
      while(!st.empty() && st.peek()>ch && freq[st.peek()-'a']>0){
        visited[st.pop()-'a'] = false;
      }
      st.push(ch);
      visited[ch-'a'] = true;
      }
      StringBuilder ans = new StringBuilder();
      for(char ch : st ){
        ans.append(ch);
      }
      return ans.toString();
    }
}