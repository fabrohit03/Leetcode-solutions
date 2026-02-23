class Solution {
    private boolean candy(int [] candies,int n, long guess,long k){
        long count =0;
        for(int i=0;i<n;i++){
           count+=candies[i]/guess;
           if(count>=k) return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        long res = 0;
        long low = 1;
        long high = Integer.MIN_VALUE;
        for(int c:candies){
            high = Math.max(high,c);
        }
        while(low<=high){
            long guess = low+(high-low)/2;
            if(candy(candies,n,guess,k)==true){
                res = guess;
                low = guess+1;
            }else{
                high = guess-1;
            }
        }

        return (int) res;
    }
}