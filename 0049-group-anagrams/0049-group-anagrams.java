
class Solution {

    public List<List<String>> groupAnagrams(String[] arr) {

            // TLE

        // List<List<String>> ans = new ArrayList<>();  
        // boolean[] used = new boolean[arr.length];

        // for (int i = 0; i < arr.length; i++) {

        //     if (used[i]) continue;

        //     List<String> group = new ArrayList<>();

        //     for (int j = i; j < arr.length; j++) {

        //         if (!used[j] &&
        //             check_anagram(arr[i]).equals(check_anagram(arr[j]))) {

        //             group.add(arr[j]);
        //             used[j] = true;
        //         }
        //     }

        //     ans.add(group);
        // }

        // return ans;

         HashMap<String ,List<String>> map   =  new HashMap<>();

        for(int i  =0;i<arr.length;i++){
            String word  = arr[i];
            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key  = new String(ch); // type casting

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(arr[i]);


        }
        return new ArrayList<>(map.values());


    }

    // public HashMap<Character, Integer> check_anagram(String s) {

    //     HashMap<Character, Integer> map = new HashMap<>();

    //     for (int i = 0; i < s.length(); i++) {

    //         char ch = s.charAt(i);

    //         map.put(ch, map.getOrDefault(ch, 0) + 1);
    //     }

    //     return map;
    // }
}