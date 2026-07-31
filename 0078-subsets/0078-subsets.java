class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> element = new ArrayList<>();

        subsets(nums, 0, element, ans);

        return ans;
    }

    public void subsets(int[] nums,
                        int index,
                        List<Integer> element,
                        List<List<Integer>> ans) {

        if (index >= nums.length) {
            ans.add(element);
            return;
        }

        // Exclude
        subsets(nums, index + 1, new ArrayList<>(element), ans);

        // Include
        List<Integer> include = new ArrayList<>(element);
        include.add(nums[index]);
        subsets(nums, index + 1, include, ans);
    }
}