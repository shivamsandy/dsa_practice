class Solution {
    public int largestAltitude(int[] arr) {
         int highest_altitude =   0;
        int sum =0;

        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            highest_altitude  =Math.max(highest_altitude, sum);
        }

        return highest_altitude;
        
    }
}