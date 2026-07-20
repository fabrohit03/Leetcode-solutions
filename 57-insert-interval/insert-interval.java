class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;
        boolean insert = false;
        for(int i=0; i<n ; i++){
            int st = intervals[i][0];
            if(st>=newInterval[0] && insert==false){
                list.add(newInterval);
                insert = true;
            }
            list.add(intervals[i]);}
            if(!insert){
                list.add(newInterval);
            }
        List<int[]> res = new ArrayList<>();
        int st1 = list.get(0)[0];
        int end1 = list.get(0)[1];
        for(int i=0; i<list.size();i++){
            int st2 = list.get(i)[0];
            int end2 = list.get(i)[1];
            if(end1>=st2){
                st1 = st1;
                end1 = Math.max(end1,end2);
                continue;
            }
            res.add(new int[]{st1,end1});
            st1 = st2;
            end1 = end2;
        }
        res.add(new int[]{st1,end1});
        return res.toArray(new int[res.size()][]);
    }
}