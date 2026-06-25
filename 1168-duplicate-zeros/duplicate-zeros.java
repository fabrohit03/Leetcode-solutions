class Solution {
    public void duplicateZeros(int[] arr) {
     int possZeroDups =0;
     int lastIndex = arr.length-1;

     for(int i=0; i<=lastIndex-possZeroDups; i++){
        if(arr[i]==0){
            if(i==lastIndex-possZeroDups){
                arr[lastIndex]=0;
                lastIndex -=1;
                break;
            }
            possZeroDups++;
        }
     }
     int newLastIndex = lastIndex-possZeroDups;
     for(int i =newLastIndex; i>=0;i--){
        if(arr[i]==0){
            arr[i+possZeroDups] = 0;
            possZeroDups--;
            arr[i+possZeroDups]=0;

        }else{
            arr[i+possZeroDups]=arr[i];
        }
     }
    }
}