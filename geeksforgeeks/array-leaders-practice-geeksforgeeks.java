// Problem: Array Leaders | Practice | GeeksforGeeks
// Link: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

 //brute force
 //class Solution {
 //   static ArrayList<Integer> leaders(int arr[]) {
 //             int n=arr.length;
 //             ArrayList temp=new ArrayList<>();
 //             for(int i=0;i<n;i++){
 //                 boolean leader=true;
 //                 for(int j=i+1;j<n;j++){
 //                     if(arr[j]>arr[i]){
 //                        leader =false;
 //                        break;
 //                     }
 //                   }
 //                  if(leader==true){
 //                       temp.add(arr[i]);
 //                   }
 //                  
 //                 }
 //       
 //           return temp;
 //   }
 //}

//optimal solution;
import java.util.Collections;
class Solution{
    static ArrayList<Integer> leaders(int arr[]) {
        int n=arr.length;
        ArrayList temp=new ArrayList<>();
        int min=arr[n-1];
        temp.add(min);
        for(int i=n-2;i>-1;i--){
            if(arr[i]>=min){
                min=arr[i];
                temp.add(min);
            }
        }
         Collections.reverse(temp);
         return temp;
    }    
}
