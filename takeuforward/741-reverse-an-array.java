// Problem: 741. Reverse an array
// Link: https://takeuforward.org/practice/dsa/reverse-an-array?tab=code&sidebar=0

class Solution {
    int i=0;
    public int[] reverse(int[] a, int n, ) {
       if(i>=n/2){
           int temp=a[i];
           a[i]=a[n-i-1];`
           a[n-i-1]=temp;
           reverse(a,n,i+1);
       }
        return a;
}
}



