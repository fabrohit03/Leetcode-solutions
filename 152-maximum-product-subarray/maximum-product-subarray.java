class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
       
            for(int j=0; j<nums.length; j++){
                int product=1;
                for(int i=j; i<nums.length; i++){
                product *= nums[i];
                ans=Math.max(product,ans);
            }}
        
        return ans;
    }
}