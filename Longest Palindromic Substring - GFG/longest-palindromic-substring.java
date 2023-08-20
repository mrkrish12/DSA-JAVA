//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestPalindrome(String s){
        // code here
        int l=0;
        String ans="";
        
        for(int i=0;i<s.length();i++)
        {
            StringBuilder cur = new StringBuilder();
            for(int j=i;j<s.length();j++)
            {
                cur.append(s.charAt(j));
                if(checkPalindrom(cur.toString()))
                {
                    if(cur.length()>l)
                    {
                        ans = cur.toString();
                        l = cur.length();
                    }
                }
            }
        }
        return ans;
        
    }
    
    public boolean checkPalindrom(String s)
    {
        int l = 0;
        int e = s.length()-1;
        
        while(l<e)
        {
            if(s.charAt(l) == s.charAt(e))
            {
                l++;
                e--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}