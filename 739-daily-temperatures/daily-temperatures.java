class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     int n=temperatures.length;
     int [] answer = new int [n];
     Stack<Integer> st =new Stack<>();
     st.push(n-1);
     for(int i=n-2;i>=0;i--){
        while(!st.empty() && temperatures[st.peek()]<=temperatures[i]){
            st.pop();

        }
        if(st.empty()){
            answer[i]=0;
        }
        else{
            answer[i]=st.peek()-i;
        }
        st.push(i);
     }
     return answer;
    }
}