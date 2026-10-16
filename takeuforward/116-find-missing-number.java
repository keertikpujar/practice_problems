// Problem: 116. Find missing number
// Link: https://takeuforward.org/practice/dsa/find-missing-number

class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int arrsum=0;
        int n=nums.length;
        sum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            arrsum=arrsum+nums[i];
        }
        return sum-arrsum;
    }
}
