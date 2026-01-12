class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                ch.push(s.charAt(i));
                continue;
            }
            if(ch.isEmpty()){
                return false;
            }
            if(s.charAt(i)==')' ){
               if( ch.peek()!='(') return false;
                ch.pop();
            }
            if(s.charAt(i)=='}'){
                if(ch.peek()!='{') return false;
                ch.pop();
            }
            if(s.charAt(i)==']'){
                if(ch.peek()!='[') return false;
                ch.pop();
            }
        }
        return ch.isEmpty();
    }
}