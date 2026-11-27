// Problem: 166. Power Set
// Link: https://takeuforward.org/practice/dsa/power-set?tab=code


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }
    
    private void generateSubsets(int ind, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        if (ind == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Pick nums[ind]
        current.add(nums[ind]);
        generateSubsets(ind + 1, nums, current, ans);

        // Backtrack (do not pick nums[ind])
        current.remove(current.size() - 1);
        generateSubsets(ind + 1, nums, current, ans);
    }
}
