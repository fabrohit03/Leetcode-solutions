class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int n=height.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int res=Math.min(height[i],height[j]);
            int width=j-i;
            int area=width*res;
            max=Math.max(area,max);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}