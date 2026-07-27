class Solution {
    public boolean increasingTriplet(int[] arr) {

        // THIS CODE I HAVE WRRITE IT CHECK ONLY CONSECUTIVE  ELEMENTS

        // boolean flag  =  false;
        // for(int i  =1;i<arr.length-1;i++){
        //     if(arr[i]>arr[i-1] && arr[i]<arr[i+1]){
        //         flag  = true;
        //     }

        // }
        // return flag;


        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num <= first) {
                first = num;
            } 
            else if (num <= second) {
                second = num;
            } 
            else {
                
                return true;
            }
        }
        return false;

    }
}