class Solution {
    public int trap(int[] height) {
        int total=0, lMax=0, rMax =0;
        int l=0;
        int r =height.length-1;
        while(l<r){
            lMax = Math.max(lMax,height[l]);
            rMax = Math.max(rMax,height[r]);
            if(lMax<rMax){
                total += lMax-height[l];
                l++;
            }else{
                total += rMax-height[r];
                r--;
            }
        }
        return total;
    }
}