class Solution {
    public String longestPalindrome(String s) {
        int l=0;
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            StringBuilder curr = new StringBuilder();
            for(int j=i;j<s.length();j++)
            {
                curr.append(s.charAt(j));
                if(checkPalindrom(curr.toString()))
                {
                    if(curr.length()>l)
                    {
                        ans= curr.toString();
                        l = curr.length();
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