class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                ans.append(st.pop());
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}