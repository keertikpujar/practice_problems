// Problem: 255. Search insert position
// Link: https://takeuforward.org/practice/dsa/search-insert-position?tab=code

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // When not found, `left` points to the exact index where `target` should be inserted
        return left;
    }
}

