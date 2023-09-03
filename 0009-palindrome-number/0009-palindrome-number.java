class Solution {
    public boolean isPalindrome(int x) {
       int num = reverse(x);
        if(num ==x)
        {
            return true;
        }
        else return false;
    }
    public int reverse(int n)
    {
        int num = 0;
        while(n>0)
        {
            num = num*10+(n%10);
            n = n/10;
        }
        return num;
    }
}