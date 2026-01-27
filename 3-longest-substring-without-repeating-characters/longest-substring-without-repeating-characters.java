class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>freq=new HashMap<>();
        int n=s.length();
        int low=0;
        
        int res=0;
       
        for(int high=0;high<n;high++){
            char ch=s.charAt(high);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            while(freq.get(ch)>1){
                char leftChar=s.charAt(low);
                freq.put(leftChar,freq.getOrDefault(leftChar,0)-1);
                if(freq.get(leftChar)==0){
                    freq.remove(leftChar);
                }
                low++;
                
            }
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}