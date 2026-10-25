// Problem: 897. Sum of Array Elements II
// Link: https://takeuforward.org/practice/dsa/sum-of-array-elements-ii?tab=code

class Solution {
    public int arraySum(int[] nums) {
        return helper(nums, nums.length-1);
    }

    public int helper(int[] nums, int index){
        if(index<0) return 0;
        else{
            return nums[index]+helper(nums,index-1);
        }
    }
}
