class Solution {
    public int[] rearrangeArray(int[] arr) {

        int n = arr.length;

        int positive[] =  new int [n/2];
        int negative[] =  new int [n/2];

        int x =0,y=0;

        for(int i =0;i<n;i++){

            if(arr[i]>0){
                positive[x++] =arr[i];
            }else{
                negative[y++] =arr[i];
            }
        }
        x=0;
        y=0;
        int result[] = new int [n];

        for(int i=0;i<result.length;i++){
            if(i%2==0){
                result[i] = positive[x++];
            }
            else{
               result[i]  = negative[y++];
            }

        }

        
        return result;
    }
}