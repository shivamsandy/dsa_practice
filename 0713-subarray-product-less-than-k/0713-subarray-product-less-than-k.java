class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int target) {


         if (target <= 1) {  // edge case
            return 0;
        }


        int product1 =  1;
        int count  =0;
        int strt  =0;
        int end  =  0;
        while(end <arr.length){
            //expand the window
            product1 *= arr[end];
            // shriking phase
            while(product1 >= target){
                product1 = product1/arr[strt];
                strt++;
            }
            count += (end-strt+1);
            end++;
        }
        return count;
        
    }
}
    //   BRUTE FORCE
//  int count  =0;
//         for(int start =0;start<arr.length;start++){
            
//             for(int end = start;end<arr.length;end++){
//                 int product  =1;
//                 for(int k =start;k<=end;k++){
//                     System.out.print(arr[k]+" ");
//                     product *=arr[k];
                    
//                 }
//                  if(product<110){
//                         count++;
//                     }
//                 System.out.println();
//             }

//         }
// return count