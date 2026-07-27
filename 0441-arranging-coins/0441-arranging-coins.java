class Solution {
    public int arrangeCoins(int n) {
        for (int i = 1; ; i++) {

            if (n < i) {
                return i - 1;
            }

            n -= i;
        }
        
    }
}