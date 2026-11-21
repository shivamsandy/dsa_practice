class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st  =  new HashSet<>();

         
        int max_streak=0;

        for(int x :nums) st.add(x); // add element to hashset

        for(int num : st){
            if(!st.contains(num-1)){  // num is starting point of sequence
                int currNum  = num;
                int currStreak =1;
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                max_streak = Math.max(max_streak,currStreak);
            }
        }

        return max_streak;
    }
}