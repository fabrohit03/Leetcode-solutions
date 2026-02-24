class Solution {
    private boolean func(int [] weights , long guess,int days){
        int count =1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]>guess){
                count++;
                sum=weights[i];
            }
            else {
                sum+=weights[i];
            }
        }
        return count<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        long low=Integer.MIN_VALUE;
        long high = 0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        long res=0;
        while(low<=high){
            long guess = low+(high-low)/2;
            if(func(weights,guess,days)==true){
                res=guess;
                high=guess-1;
            }else{
                low=guess+1;
            }
        }
        return (int) res;
    }
}