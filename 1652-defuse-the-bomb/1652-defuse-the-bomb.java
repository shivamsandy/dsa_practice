class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int sum = 0;
        int arr[] = new int[n];
        if (k == 0)
            return arr;

        if (k > 0) {
            for (int i = 1; i <= k; i++) { //  calculating first window
                sum += code[i % n];
            }
            for (int i = 0; i < n; i++) {
                arr[i] = sum;

                sum -= code[(i + 1)%n]; // remove first element from window
                sum += code[(i + k + 1) % n]; // add the next element in the windo
            }
        } else {
            k = -k;
            for (int j = 1; j <= k; j++) {
                sum += code[(n - j) % n];
            }
            for (int i = 0; i < n; i++) {

                arr[i] = sum;

                // Remove old element
                sum -= code[(i - k + n) % n];

                // Add new element
                sum += code[i];
            }

        }

        return arr;

    }
}

//    int sum =0;

//     for(int x  : code){
//         sum+=x;
//     }

//    for(int i =0;i<code.length;i++){
//         int y = sum;
//         code[i] = y - code[i];
//    }
// return code;