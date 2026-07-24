class Solution {
    public int[] nextGreaterElements(int[] nums) {

        // YEA BAKCHODI KRNE SE NAHI HUA TEST CASE FAIL KR GYA
        
        // int k =  nums.length;
        // int arr[] = new int[nums.length * 2];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = nums[i % k];
        // }

        // Stack<Integer> st = new Stack<>();
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = arr.length - 1; i >= 0; i--) {
        //     while (!st.isEmpty() && st.peek() <= arr[i]) {
        //         st.pop();
        //     }

        //     if (st.isEmpty()) {
        //         map.put(arr[i], -1);
        //         st.push(arr[i]);
        //     } else {
        //         map.put(arr[i], st.peek());
        //     }
        //     st.push(arr[i]);
        // }

        // int ans[] = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        //     ans[i] = map.get(nums[i]);
        // }
        // return ans;

    int n   = nums.length;
         int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }

            st.push(nums[i % n]);
        }
        return ans;

    }
}