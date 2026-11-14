// Problem: 1. Two Sum
// Link: https://takeuforward.org/practice/dsa/two-sum

//Brute force method
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int i,j,n;
       int[] a=new int[2];
       n=nums.length;
       for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
                a[0]=i;
                a[1]=j;
            }
        }
       }
       return a;
    }
}
