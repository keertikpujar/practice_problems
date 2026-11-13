// Problem: 196. Remove duplicates from sorted array
// Link: https://takeuforward.org/practice/dsa/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
      int i=0;
      for(int j=1;j<nums.length;j++){
        if(nums[i]!=nums[j]){
            nums[++i]=nums[j];
        }
      }  
        return i+1 ;
    }
}
