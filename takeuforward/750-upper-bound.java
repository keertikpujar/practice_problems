// Problem: 750. Upper Bound
// Link: https://takeuforward.org/practice/dsa/upper-bound

class Solution {
    public int upperBound(int[] nums, int x) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>x) return i;
        }
        return nums.length;
    }
}

