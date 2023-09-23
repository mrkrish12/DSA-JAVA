class Solution {
    public char findTheDifference(String s, String t) {
       int total=0;   
        for(int j=0;j<t.length();j++)
        {
            total = total+t.charAt(j);
        }
         for(int i=0;i<s.length();i++)
        {
            total = total-s.charAt(i);
        }
        return (char)total;
    }
}