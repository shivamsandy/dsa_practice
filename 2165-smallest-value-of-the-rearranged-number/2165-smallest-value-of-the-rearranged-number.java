class Solution {
    public long smallestNumber(long num) {
         boolean isNegative = num < 0;

        ArrayList<Integer> digits = new ArrayList<>();
        while (num != 0) {
            int ld = (int) (num % 10);
            digits.add(ld);
            num = num / 10;
        }

        digits.sort(null);
        System.out.println(digits);

        int arr[] = new int[digits.size()];

        if (isNegative) {
            for (int i = 0; i < digits.size(); i++) {

                arr[i] = Math.abs(digits.get(i));
            }
        } else {

            for (int i = 0; i < digits.size() - 1; i++) {

                if (digits.get(i) == 0 && digits.get(i + 1) != 0) {

                    // first non-zero ko first position par lao
                    int temp = digits.get(0);
                    digits.set(0, digits.get(i + 1));
                    digits.set(i + 1, temp);

                    break;
                }
            }

            for (int i = 0; i < digits.size(); i++) {
                arr[i] = digits.get(i);
            }

        }

        long ans = 0;

        for (int x : arr) {
            ans = ans * 10 + x;
        }

        if (isNegative) {
            ans = -ans;
        }

        return ans;
        
    }
}