class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        // if(event1[1].compareTo(event2[0]) >=0){
        // return true;
        // }else{
        //     return false;
        // }

           if (event1[1].compareTo(event2[0]) < 0) {
            return false;
        }

         
        if (event2[1].compareTo(event1[0]) < 0) {
            return false;
        }
        return true;


    }
}