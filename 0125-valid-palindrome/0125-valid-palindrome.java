class Solution {
    public boolean isPalindrome(String str) {
         str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");
         int s=0;
        int e = str.length()-1;
        while(s<=e)
        {
            if(str.charAt(s) != str.charAt(e))
            {
                   return false;
            }
            else{
                s++;e--;
            }
        }
return true;
        
    }
}