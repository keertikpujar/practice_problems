// Problem: 832. Left Rotate Array by One
// Link: https://takeuforward.org/practice/dsa/left-rotate-array-by-one?tab=code

class Solution {
    public void rotateArrayByOne(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        
        int temp = nums[0]; // Store the first element
        
        // Shift all elements to the left by one position
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        
        // Place the first element at the end
        nums[nums.length - 1] = temp;
        
    }
}
