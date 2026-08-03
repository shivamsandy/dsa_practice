class Solution {
    public int maxProduct(int[] arr) {

        
        //  this will not wrok in test case

        // int maxproduct=1;
        // int current_product =1;

        // for(int i=0;i<arr.length;i++){
            
        //     if(current_product<0){
        //         current_product=1;
        //     }
        //      current_product =arr[i]*current_product;
        //      maxproduct =Math.max(maxproduct, current_product);
        // }

    // we use dynamic program 

    int min =arr[0];
    int max =arr[0];
    int ans =max;
    for(int i =1;i<arr.length;i++){
        int x =arr[i];
        int temp_min  =  Math.min(x,Math.min(x*min,x*max));
        max  =  Math.max(x,Math.max(x*min,x*max));

        min  =temp_min;
        ans= Math.max(ans,max);
    }
        return ans;

        
    }
}