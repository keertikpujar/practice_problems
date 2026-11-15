// Problem: 83. Majority Element-I
// Link: https://takeuforward.org/practice/dsa/majority-element-i?tab=code&sidebar=0

//brute force
class Solution {
    public int majorityElement(int[] a) {
        
        for (int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count=count+1;
                }
            }
            if(count>a.length/2){
                return a[i];
            }
        }
        return -1;
    }
}
