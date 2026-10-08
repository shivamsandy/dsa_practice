class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        for(int i=1;i<=4;i++){
            if(Arrays.deepEquals(rotate(mat),target)){
                return true;
            }
        }
        return false;
    }


    public static int[][] rotate (int image[][] ){
        int r =  image.length;
        int c  = image[0].length;

          for(int i=0;i<r;i++){ //  transpose
            for(int  j =i+1;j<c;j++){
                int temp =  image[i][j];

                image[i][j] =image[j][i];
                image[j][i] =  temp;
            }
        }
         for(int i=0;i<r;i++){ // swap
             swap(image[i]);
        }

        return image;
        
    }
 

    public  static  void  swap(int arr[]){
        int i=0;
        int j =arr.length-1;

        while(i<j){
            int temp  = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

        
        
    
}