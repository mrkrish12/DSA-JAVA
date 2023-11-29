public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c=0;
        String s = Integer.toBinaryString(n).replaceAll("0","");
        return s.length();
      
        
    }
}