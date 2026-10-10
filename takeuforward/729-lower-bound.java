// Problem: 729. Lower Bound
// Link: https://takeuforward.org/practice/dsa/lower-bound-

class Solution {
    public int lowerBound(int[] nums, int x) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=x){
                return i;
            }
        }
        return nums.length;
    }
}

