class Solution {
    class TrieNode{
        TrieNode[] child = new TrieNode[26];
        boolean isEnd = false;
    }
    TrieNode root = new TrieNode();
    public boolean wordBreak(String s, List<String> wordDict) {
        for (String word : wordDict) {
            insert(word);
        }
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for(int i=0; i<n; i++){
            if(!dp[i]) continue;
            TrieNode curr = root;
            for(int j=i; j<n; j++){
                int index = s.charAt(j)-'a';
                if(curr.child[index]==null) break;
                curr = curr.child[index];
                if(curr.isEnd){
                    dp[j+1] = true;
                }
            }
        }
        return dp[n];
    }
    private void insert(String word){
        TrieNode curr = root;
        for(char ch : word.toCharArray()){
            int index = ch-'a';
            if(curr.child[index]==null) {
                curr.child[index] = new TrieNode();
            }
            curr = curr.child[index];
        }
        curr.isEnd = true;
    }
}