class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        StringBuilder t = new StringBuilder();
        t.append("1");
        t.append(s);
        t.append("1");
      List<Integer>list = new ArrayList<>();
      int count =0;
      int i=0;
      int j=0;
      while(j<t.length()){
        if(t.charAt(i)==t.charAt(j)){
            count++;
            j++;
            continue;
        }
        list.add(count);
        count =0;
        i=j;

      }
      list.add(count);
      int max =0;
      for( i=2; i<list.size()-1; i+=2){
        max = Math.max(max, list.get(i-1)+list.get(i+1));
      }

     int maxCount = 0;
    for (i = 0; i < s.length(); i++) {
    if (s.charAt(i) == '1') maxCount++;
            }
    return maxCount+max;
    }
}