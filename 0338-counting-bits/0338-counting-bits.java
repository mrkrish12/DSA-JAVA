class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n+1];
        int j=0;
        for(int i=0;i<=n;i++)
        {
            res[j++]=add(i);
        }
        return res;
    }
    public int add(int n)
    {
        if(n == 0 || n==1)
        {
            return n;
        }
        else if(n%2 == 0)
        {
            return add(n/2);
        }
        else
            return 1+(add(n/2));
    }
}