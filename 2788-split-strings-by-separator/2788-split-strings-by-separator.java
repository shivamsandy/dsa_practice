class Solution {
    public List<String> splitWordsBySeparator(List<String> arr, char separator) {
         List<String> list  =  new ArrayList<>();

        // String arr[] = {"one.two.three","four.five","six"};

        for(int i=0;i<arr.size();i++){

            String word  =  arr.get(i);

           String[] parts = word.split("\\" + separator);

            for (String part : parts) {
                if(!part.isEmpty())
                list.add(part);
            }
        }


        return list;
        
    }
}