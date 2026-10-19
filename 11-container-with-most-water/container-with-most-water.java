class Solution {
    public int maxArea(int[] height) {
       int n = height.length;
       int max = Integer.MIN_VALUE;
       int i=0;
       int j=n-1;
       while(i<j){
        int w= j-i;
        int h=Math.min(height[i],height[j]);
        int area = w*h;
        max=Math.max(max,area);
        if(height[i]<height[j]) i++;
        else j--;
       }
       return max;
    }
}