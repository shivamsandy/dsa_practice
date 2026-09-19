class Solution {
    public int[][] merge(int[][] intervals) {

        // 1----3
        //   2-------6
        //               8----10
        //                          15-----18

        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> list =  new ArrayList<>();
        list.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
            int current[] = intervals[i];
            int prev[] = list.get(list.size()-1);

            if(current[0]<=prev[1]){
                  prev[0] =  Math.min(prev[0],current[0]);
                prev[1] =  Math.max(prev[1],current[1]);
            }else{
                list.add(intervals[i]);
            }
        }
        int result[][] =  new int[list.size()][1];

        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }

        return result;


        
    }
}