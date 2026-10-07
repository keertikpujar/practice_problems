// Problem: 695. Second Largest Element
// Link: https://takeuforward.org/practice/dsa/second-largest-element

class Solution {
    public int secondLargestElement(int[] a) {
       if(a==null||a.length<2){
        return -1;
       }
       int max=Integer.MIN_VALUE;
       int secmax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
               if(max<a[i]){
                max=a[i];
                }
            }
        for(int i=0;i<a.length;i++){
            if(a[i]>secmax&&a[i]<max){
                secmax=a[i];
            }
        }
       
        
        return (secmax==Integer.MIN_VALUE)?-1:secmax;
        
    }
}
