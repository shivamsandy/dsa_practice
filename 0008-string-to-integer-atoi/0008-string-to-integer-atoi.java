class Solution {
    public int myAtoi(String s) {

        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        StringBuilder st = new StringBuilder();

        long num = 0;
        int start = 0;

        boolean negative = false;

        if (s.charAt(0) == '-') {
            negative = true;
            start = 1;
        } 
        else if (s.charAt(0) == '+') {
            start = 1;
        }

        for (int i = start; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!Character.isDigit(ch)) {
                break;
            }

            st.append(ch);

            int digit = ch - '0';
            num = num * 10 + digit;

            if (negative && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            if (!negative && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        if (negative) {
            num = -num;
        }

        return (int) num;
    }
}