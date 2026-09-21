class Solution {
    public boolean findSubarrays(int[] arr) {

         HashSet<Integer> set  =  new HashSet<>();
        set.add(arr[0]+arr[1]);
        int length =2;

        boolean flag =false;
        

        int sum  = 0;
        for(int i =0;i<arr.length;i++){
            
            sum  +=arr[i];

            if(i>= length){
                sum -=arr[i-length];
                if(set.contains(sum)){
                    System.out.println("eske ander matching sum phile se hai");
                    flag =true;
                    return flag;
                }else{
                    set.add(sum);
                }
            }
        }

    return flag;
        
    }
}