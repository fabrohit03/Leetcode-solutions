class Solution {
    public int reverse(int x) {
        int opp =0;
        while(x!=0){
            int d = x%10;
            if(opp>Integer.MAX_VALUE/10 || opp<Integer.MIN_VALUE/10){
                return 0;
            }
            opp = opp*10+d;
            x/=10;
        }
        return opp;
    }
}