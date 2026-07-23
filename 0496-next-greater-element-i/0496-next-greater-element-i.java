class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {

        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = num2.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= num2[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                map.put(num2[i], -1);
            } else {
                map.put(num2[i], st.peek());
            }

            st.push(num2[i]);
        }

        int[] result = new int[num1.length];

        for (int i = 0; i < num1.length; i++) {
            result[i] = map.get(num1[i]);
        }

        return result;

    }
}