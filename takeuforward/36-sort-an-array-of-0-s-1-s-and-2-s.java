// Problem: 36. Sort an array of 0's 1's and 2's
// Link: https://takeuforward.org/practice/dsa/sort-an-array-of-0's-1's-and-2's

class Solution {
    public void sortZeroOneTwo(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
               int temp=nums[mid];
               nums[mid]=nums[low];
               nums[low]=temp;
               low++;
               mid++;
            }
            else if(nums[mid]==1){
                  mid++;
            }
            else{
                  int temp=nums[mid];
                  nums[mid]=nums[high];
                  nums[high]=temp;
                  high--;
            }
        }
    }
}
