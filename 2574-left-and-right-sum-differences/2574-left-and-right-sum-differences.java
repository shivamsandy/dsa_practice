class Solution {
    public int[] leftRightDifference(int[] arr) {
         int n  =arr.length;

        int  left[] = new int [n];
        int  right[] = new int [n];

        int sum =0;
        int left_prefix  =  0;
        for(int x:arr){
            sum +=x;
        }

        for(int i =0;i<arr.length;i++){
            if(i==0){
                left[i]=0;
            }else{
                left_prefix +=arr[i-1];
                left[i] =left_prefix;
            }
            right[i] = sum -arr[i];
            sum-=arr[i];

        }

        int ans=0;
        for(int i=0;i<n;i++){
            arr[i] = Math.abs(left[i] -right[i]);
        }

        return arr;

        
    }
}