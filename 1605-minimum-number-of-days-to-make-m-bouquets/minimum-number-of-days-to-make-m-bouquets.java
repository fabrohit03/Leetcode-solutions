class Solution {
    private boolean bloom(int [] bloomDay, long guess, int m ,int k){
        int count = 0;
        int bouquet = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=guess){
                count++;
                if(count ==k){
                    bouquet++;
                    count =0;
                }
            }else{
                count =0;
            }
        }
        return bouquet>=m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long) m*k) return -1;
        long low = Integer.MAX_VALUE;
        long high = Integer.MIN_VALUE;
        for(int day : bloomDay){
            low = Math.min(low,day);
            high = Math.max(high,day);
        }
        long ans = -1;
        while(low<=high){
            long guess = low+(high-low)/2;
            if(bloom(bloomDay,guess,m,k)==true){
                ans = guess;
                high = guess-1;
            }else{
                low = guess+1;
            }
        }
        return (int) ans;
    }
}