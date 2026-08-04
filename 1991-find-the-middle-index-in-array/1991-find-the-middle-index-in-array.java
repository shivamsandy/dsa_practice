class Solution {
    public int findMiddleIndex(int[] arr) {
        int totalsum  =  0;
        for(int x: arr){
            totalsum +=x;
        }

        int left_sum = 0;
        System.out.println(totalsum);


        for(int i=0;i<arr.length;i++){
            totalsum -=arr[i];
            if(totalsum==left_sum){
                return i;
            }

            left_sum +=arr[i];
        }

        return -1;
        
    }
}