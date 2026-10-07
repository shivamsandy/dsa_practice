class Solution {
    public void rotate(int[][] image) {

        int r  =  image.length;
        int col  =  image[0].length;
        //transpose
         for(int i=0;i<r;i++){
            for(int  j =i+1;j<col;j++){
                int temp =  image[i][j];

                image[i][j] =image[j][i];
                image[j][i] =  temp;
            }
        }
         for(int i=0;i<r;i++){
             swap(image[i]);
        }
        
    }
    //   public  static  void transpose(int [][] image ,int r , int col){
        
    //     for(int i=0;i<r;i++){
    //         for(int  j =i+1;j<col;j++){
    //             int temp =  image[i][j];

    //             image[i][j] =image[j][i];
    //             image[j][i] =  temp;
    //         }
    //     }

    // }

    // public  static  void  rotate(int image[][] , int r , int c){
    //      for(int i=0;i<r;i++){
    //          swap(image[i]);
    //     }

    // }

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