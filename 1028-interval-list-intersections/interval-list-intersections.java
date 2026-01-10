class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]>list=new ArrayList<>();
        int i=0;
        int j=0;
        int n=firstList.length;
        int m=secondList.length;
        while(i<n&&j<m){
            int start1=firstList[i][0];
            int end1=firstList[i][1];
            int start2=secondList[j][0];
            int end2=secondList[j][1];
            if(start1<=start2){
            if(end1>=start2){
                int max=Math.max(start1,start2);
                int min=Math.min(end1,end2);
                list.add(new int[] {max,min});
            }
            }
            else
            {
                if(end2>=start1){
                     int max=Math.max(start1,start2);
                int min=Math.min(end1,end2);
                list.add(new int[] {max,min});
                }
            }
            if(end1<end2){
                i++;
            }
            else j++;
        }
        return list.toArray(new int[list.size()][]);
    }
}