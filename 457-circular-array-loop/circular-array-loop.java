class Solution {
    public int getNextPos(int [] nums , int index, boolean ifForward){
        boolean direction = nums[index]>0;
        if(direction!=ifForward) return -1;
        int nextIndex=(index+nums[index])%nums.length;
        if(nextIndex<0) nextIndex+=nums.length;
        if(nextIndex==index) return -1;
        return nextIndex;
    }

    public boolean circularArrayLoop(int[] nums) {
    int n=nums.length;
    for(int i=0;i<n;i++){
        if(nums[i]==0) continue;
        boolean ifForward = nums[i]>0;
        int slow,fast;
        slow=fast=i;
        while(true){
            slow = getNextPos(nums,slow,ifForward);
            if(slow==-1) break;
            fast= getNextPos(nums,fast,ifForward);
            if(fast==-1) break;
            fast= getNextPos(nums,fast,ifForward);
            if(fast==-1) break;
            if(fast==slow){
                return true;
            }
        }
            int curr=i;
            while(nums[curr]!=0 && (nums[curr]>0)==ifForward){
                int next = getNextPos(nums,curr,ifForward);
                nums[curr]=0;
                if(next==-1) break;
                curr=next;
            }
            
        
    }
    return false;
    }
}
