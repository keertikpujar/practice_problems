// Problem: 702. Largest Element
// Link: https://takeuforward.org/practice/dsa/largest-element

class Solution {
    public int largestElement(int[] a) {
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    
    }
}
