class Solution {

    int f(int n){
        if(n<=1) return n;
        int last=f(n-1);
        int slast=f(n-2);
        return last+slast;
    }

    public int fib(int n) {
      return f(n);
    }
}