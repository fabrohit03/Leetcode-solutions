class Solution {
    class Pair {
    String word;
    int steps;

    Pair(String word, int steps) {
        this.word = word;
        this.steps = steps;
    }
}
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int n = wordList.size();
        HashSet<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(beginWord,1));
        set.remove(beginWord);
            while(!q.isEmpty()){
                Pair p = q.poll();
                String s = p.word;
                int val = p.steps;
                if(s.equals(endWord)) return val;
                char[] arr = s.toCharArray();
                for(int i =0; i<arr.length;i++){
                    char original = arr[i];
                    for(char ch ='a'; ch<='z'; ch++){
                        if(ch==original) continue;
                        arr[i]=ch;
                        String newWord = new String(arr);
                        if(set.contains(newWord)){
                            q.offer(new Pair(newWord,val+1));
                            set.remove(newWord);
                        }
                        
                    }
                    arr[i]=original;
                
            }
        }
        return 0;
    }
}