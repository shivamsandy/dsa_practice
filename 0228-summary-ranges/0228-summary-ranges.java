class Solution {
    public List<String> summaryRanges(int[] arr) {

         int n  =  arr.length;

        ArrayList<String> list  =  new ArrayList<>();

        for(int i =0;i<n;i++){

            int strt =  arr[i];
            while(i+1<n && arr[i+1]-arr[i] ==1){
                i++;
            }
            if(strt != arr[i]){
                list.add(strt+"->"+arr[i]);
            }else{
                list.add(""+strt);
            }

        }

            return list;
        
    }
} 