// Problem: 821. Reverse an array 2
// Link: https://takeuforward.org/practice/dsa/reverse-an-array-ii

class Solution {
    public int[] reverseArray(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public int[] helper(int[] nums,int start,int end){
        if(start>=end){
             return nums;
        }
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        return helper(nums,++start,--end);
    }
}
