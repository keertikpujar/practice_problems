// Problem: 1031. Selection Sort
// Link: https://takeuforward.org/practice/dsa/selection-sort?sidebar=0

class Solution {
    public int[] selectionSort(int[] a) {

        for (int i=0;i<a.length-1;i++){
            int min_i=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min_i]){
                    min_i=j;
                }
            }
            int temp=a[min_i];
            a[min_i]=a[i];
            a[i]=temp;
        }
        return a;

    }
}
