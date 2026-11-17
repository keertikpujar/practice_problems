// Problem: 375. Rearrange array elements by sign
// Link: https://takeuforward.org/practice/dsa/rearrange-array-elements-by-sign?tab=code

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posindex=0;
        int negindex=1;
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
          if(nums[i]>0){
            ans[posindex]=nums[i];
            posindex+=2;
          }
          else{
            ans[negindex]=nums[i];
            negindex+=2;
          }
        }
        return ans;
    }
}
