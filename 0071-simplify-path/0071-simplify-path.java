class Solution {
    public String simplifyPath(String path) {
            String[] arr = path.split("/");

        for(String x: arr) System.out.println(x);
        Stack<String> st  =  new Stack<>();

        for(String element :arr){
            if(element.equals("") || element.equals(".")){
                continue;
            }else if(element.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(element);
            }
        }
        if(st.isEmpty()) return "/";

    //   System.out.println(st);
      StringBuilder sb = new StringBuilder();

        for (String folder : st) {
            sb.append("/");
            sb.append(folder);
        }

        // System.out.println("output = "+sb);

        return sb.toString();
        
    }
}