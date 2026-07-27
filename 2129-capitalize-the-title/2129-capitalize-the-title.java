class Solution {
    public String capitalizeTitle(String title) {

        
       String arr[] =  title.split(" ");

    //    for( String x:   arr){
    //     System.err.println(x);
    //    }


       for(int i =0;i<arr.length;i++){
            String s  = arr[i];

         if (s.length() <= 2) {
                arr[i] = s.toLowerCase();
            } else {
                s = s.toLowerCase();
                arr[i] = Character.toUpperCase(s.charAt(0)) + s.substring(1);
            }
       }
       String str =  String.join(" ",arr);

       return str;

        
    }
}