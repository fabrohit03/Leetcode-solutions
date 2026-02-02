class Solution {
    public int longestPalindrome(String s) {
    HashMap<Character,Integer> need =new HashMap<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        need.put(ch,need.getOrDefault(ch,0)+1);
    }
    int res=0;
    boolean odd= false;
    for(int val:need.values()){
        if(val%2==0){
            res+=val;
        }
        else{
            res+=val-1;
            odd=true;
        }
    }
    if(odd){
        res+=1;
    }
       return res; 
    }
}