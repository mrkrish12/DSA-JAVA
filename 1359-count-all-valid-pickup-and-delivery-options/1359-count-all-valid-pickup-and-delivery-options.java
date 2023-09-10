class Solution {
    public int countOrders(int n) {
          long ans =1;
        int mod = 1000000007;
        for(int i=1;i<=2*n;i++)
        {
            ans*=i;
            if(i%2==0)
            {
              ans=  ans/2;
            }
            ans%=mod;
        }
        return (int)ans;
    }
}