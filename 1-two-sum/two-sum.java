class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];
           for(int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i]; // value
            arr[i][1] = i;       // original index
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(arr[i][0]+arr[j][0]==target) return new int[]{arr[i][1], arr[j][1]};
            else if(arr[i][0]+arr[j][0]>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{};
    }
}