// Problem: 942. Pattern 18
// Link: https://takeuforward.org/practice/dsa/pattern-18

class Solution {
    public void pattern18(int n) {
        char a ='A';
        char b=(char)('A'+n-1);
        for(int i=0;i<n;i++){
            for(char ch=(char)(b-i);ch<=b;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
}
