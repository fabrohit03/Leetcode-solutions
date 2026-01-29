class Solution {
    public int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int onedelete=Integer.MIN_VALUE;
        int res=arr[0];
       for(int i=1;i<arr.length;i++){
        int prevOneDelete=onedelete;
        int prevNoDelete=nodelete;
        nodelete=Math.max(nodelete+arr[i],arr[i]);
        int v2;
        if(prevOneDelete==Integer.MIN_VALUE) v2=arr[i];
        else {v2=prevOneDelete+arr[i];}
        onedelete=Math.max(v2,prevNoDelete);
        res= Math.max(res,Math.max(nodelete,onedelete));
       }
       return res;
    }
}