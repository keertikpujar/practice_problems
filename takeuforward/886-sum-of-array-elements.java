// Problem: 886. Sum of Array Elements
// Link: https://takeuforward.org/practice/dsa/sum-of-array-elements

class Solution {
  public  int sum(int arr[], int n) {
    int sum=0;
    for(int i=0;i<n;i++){
     sum=sum+arr[i];
    }  
    return sum;
    }
}

