class Solution {
    public int minSwaps(String s) {
         Stack <Character> st  =  new Stack<>();

        for(char ch  : s.toCharArray()){
            if(ch=='['){
                st.push(ch);
            }else if(!st.isEmpty() && st.peek()=='['){
                st.pop();
            }else{
                st.push(ch);
            }

        }

        System.out.println(st.size());
        int open  =  st.size()/2;

        int no_of_swap = ( open+1)/2;

        // System.out.println(no_of_swap);

        return no_of_swap;
    }
}