// Problem: 962. Pattern 20
// Link: https://takeuforward.org/practice/dsa/pattern-20

class Solution {
    public void pattern20(int n) {
        //int space=2*n-2;
        for(int i=1;i<2*n;i++){
            if(i<=n){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            }
            else{
                for(int j=0;j<2*n-i;j++){
                    System.out.print("*");
                }
            }
            
            if(i<n){
            for(int j=0 ;j<2*(n-i);j++){
                System.out.print(" ");
                    //space+=2;
            }
            }
            else{
             for(int j=0;j<2*(i-n);j++)
                  System.out.print(" ");
                //space-=2;
                }
            if(i<=n){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            }
            else{
                for(int j=0;j<2*n-i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
