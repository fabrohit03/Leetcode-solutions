class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int arr2[] = new int[n+1];
        
        int i =0;
        int j = 0;
        while(i<n && j<n){
            arr2[j]=arr[i];
            if(arr[i]==0 && j+1<n){
                arr2[j+1]=0;
                j+=2;
            }else{
                j++;
            }
            i++;
        }
        for(i=0;i<n;i++){
            arr[i]=arr2[i];
        }
    }
}