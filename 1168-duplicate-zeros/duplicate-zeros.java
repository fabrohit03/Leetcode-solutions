class Solution {
    public void duplicateZeros(int[] arr) {
     int temp [] = new int[arr.length];
     int i = 0;
     int j =0;
     while(i<arr.length && j<arr.length){
        if(arr[i]==0){
            temp[j]=0;
            j+=1;
            if(j<arr.length ){
            temp[j]=0;}
        }else{
            temp[j]=arr[i];
        }
        j+=1;
        i+=1;
     }
     for(i =0; i<arr.length;i++){
        arr[i]=temp[i];
     }
    }
}