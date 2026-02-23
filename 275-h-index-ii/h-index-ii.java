class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int i = 0;
        while(i<n && n-i > citations[i]){
            i++;
        }
        return n-i;
    }
}