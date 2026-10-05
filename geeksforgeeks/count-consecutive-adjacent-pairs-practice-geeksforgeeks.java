// Problem: Count Consecutive Adjacent Pairs | Practice | GeeksforGeeks
// Link: https://www.geeksforgeeks.org/problems/pairs-of-adjacent-elements4814/1

class Solution {
    public int adjacentPairs(int[] arr) {
        
        int count =0;
         for(int i=0;i<arr.length-1;i++){
              if(arr[i+1]==arr[i]+1){
                        count++;
                    }
         }
         return count;
    }
}
