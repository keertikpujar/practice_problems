// Problem: 838. Linear Search
// Link: https://takeuforward.org/practice/dsa/linear-search

class Solution {
    public int linearSearch(int a[], int target) {
        int index;
		for(int i=0;i<a.length;i++){
            if(a[i]==target){
                index=i;
                return index;
            }
        }
        return -1;
        
    }
       
 }

