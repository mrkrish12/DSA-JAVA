class Solution {
    public int[] findArray(int[] pref) {
        int prev = pref[0];
        int l = pref.length;
        
        for(int i=1;i<l;i++)
        {
            int cur = pref[i];
            pref[i] = prev^cur;
            prev = cur;
        }
        return pref;
    }
}