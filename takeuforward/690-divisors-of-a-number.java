// Problem: 690. Divisors of a Number
// Link: https://takeuforward.org/practice/dsa/divisors-of-a-number

import java.util.Vector;
class Solution {
    public int[] divisors(int n) {
        Vector<Integer> res=new Vector<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                 res.add(i);
            }
        }
    int[] arr=new int[res.size()];
    for(int i=0;i<res.size();i++){
        arr[i]=res.get(i);
    }
    return arr;
    }
}
