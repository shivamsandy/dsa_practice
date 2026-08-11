class Solution {
    public int[] asteroidCollision(int[] arr) {
             Stack<Integer> st  = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(st.isEmpty() || arr[i]>0){
                st.push(arr[i]);
            }else{
                while(!st.isEmpty()){
                    int top =st.peek();
                    if(top<0){
                        st.push(arr[i]);
                        break;
                    }
                    int element_abs = Math.abs(arr[i]);
                    if(element_abs==top){
                        st.pop();
                        break;
                    }else if(element_abs<top){
                        break;
                    }else{
                        st.pop();
                        if(st.isEmpty()){
                            st.push(arr[i]);
                            break;
                        }
                    }
                      

                }
                 
            }


        }
        int len  =st.size();
        int ans[] =  new int [len];
        for(int i=len-1;i>=0;i--){
            ans[i] =st.pop();
        }
        return ans;


    }
}