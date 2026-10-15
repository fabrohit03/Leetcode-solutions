class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res[] = new int[arr1.length];
        int idx=0;
        for(int num:arr2){
            int freq = map.get(num);
            for(int i=0; i<freq; i++){
                res[idx++]=num;
            }
            map.remove(num);
        }
        ArrayList<Integer>remain = new ArrayList<>();
        for(int num: map.keySet()){
            for(int i=0; i<map.get(num); i++){
                remain.add(num);
            }
        }
        Collections.sort(remain);
        for(int num:remain){
            res[idx++]=num;
        }
        return res;
    }
}