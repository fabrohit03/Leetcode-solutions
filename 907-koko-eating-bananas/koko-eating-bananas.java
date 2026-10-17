class Solution {
    long func(int[] piles, int n, int speed){
        long h =0;
        for(int pile:piles){
            h += pile/speed;
            if(pile%speed !=0){
                h++;
            }
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
       int n = piles.length;
       int maxPile = Integer.MIN_VALUE;
       for(int pile:piles){
        if(pile>maxPile){
            maxPile=pile;
        }
       }
       int res =-1;
       int low =1;
       int high =maxPile;
       while(low<=high){
        int guess = (low+high)/2;
        long hour = func(piles,n,guess);
        if(hour>h){
            low=guess+1;
        }else{
            res=guess;
            high=guess-1;
        }
       }
       return res;
    }
}