class Solution {
    private boolean bloom(int bloomDay[],long day,int m,int k){
        int count =0;
        int bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
                 if(count==k){
                    bouquets++;
                    count=0;
                }
            }else{
               count=0;
            }
            
        }
        return bouquets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k) return -1;
        long low=Integer.MAX_VALUE;
        long high=Integer.MIN_VALUE;
        for(int day:bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        long ans=-1;
        
        while(low<=high){
            long guess=(low+high)/2;
            if(bloom(bloomDay,guess,m,k)==true){
                ans=guess;
                high=guess-1;
            }else{
                low=guess+1;
            }}
        return (int) ans;
    }
}