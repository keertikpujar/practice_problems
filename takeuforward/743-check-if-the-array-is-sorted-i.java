// Problem: 743. Check if the Array is Sorted I
// Link: https://takeuforward.org/practice/dsa/check-if-the-array-is-sorted-i

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        boolean a=true;
        for(int i=0;i<n-1;i++){
          if(arr[i]<=arr[i+1]){
            a=true;
          }
            else{
                a=false;
        
            break;
            }
          }
        return a;
       
    }
}
