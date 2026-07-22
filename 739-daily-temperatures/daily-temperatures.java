class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st = new Stack<>();
        int n = temperatures.length;
        int[] arr = new int[n];
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            while(!st.empty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(st.empty()) arr[i]=0;
            else arr[i]=st.peek()-i;
            st.push(i);
        }
        return arr;
    }
}