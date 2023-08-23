//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        String ans="No";
        int f = n;
        int last=0;
        int pow=0;
        int sum=0;
         while(n>0)
         {
              last = n%10;
              pow = (int)Math.pow(last,3);
              sum+=pow;
              n=n/10;
         }
         if(sum==f)
         {
             ans="Yes";
         }
         return ans;
    }
}