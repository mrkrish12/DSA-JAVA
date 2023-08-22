class Solution {
    public String convertToTitle(int c) {
        String ans="";
        while(c>0)
        {
            c--;
            ans = (char)('A' + (c%26))+ans;
            c = c/26;
        }
        return ans;
    }
}