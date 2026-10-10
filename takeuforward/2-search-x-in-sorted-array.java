// Problem: 2. Search X in sorted array
// Link: https://takeuforward.org/practice/dsa/search-x-in-sorted-array

class Solution {
    public int search(int[] nums, int target) {
    
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
       
    }
}
