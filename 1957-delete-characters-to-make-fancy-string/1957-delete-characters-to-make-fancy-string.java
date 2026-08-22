class Solution {
    public String makeFancyString(String str) {
         StringBuilder sb =  new StringBuilder("");

        int count =1;

        for(int i =0;i<str.length()-1;i++){

            char ch  =  str.charAt(i);
            if(ch== str.charAt( i+1)){
                count++;
            }else{
                count= 1;
            }

            if(count<3){
                sb.append(ch);
            }
        }
        sb.append(str.charAt(str.length()-1));

        return sb.toString();
    }
}