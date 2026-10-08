class Solution {
   public boolean check(int[] arr){
        for(int i : arr){
            if(i==0) return false;
        }
        return true;
       }
    public int countVowelSubstrings(String word) {
        int total =0;
       
        for(int i=0; i<word.length(); i++){
            int[] arr = new int[5];
            for(int j=i; j<word.length(); j++){
                if(word.charAt(j)=='a'){
                    arr[0]++;
                }
                else if(word.charAt(j)=='e'){
                    arr[1]++;
                
                }
                else if(word.charAt(j)=='i'){
                    arr[2]++;
                }
                else if(word.charAt(j)=='o'){
                    arr[3]++;
                }
                else if(word.charAt(j)=='u'){
                    arr[4]++;
                }else break;
                if(check(arr)) total++;     
            }
        }
        return total;   
    }
}