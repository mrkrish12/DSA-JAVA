class Solution {
            public int[] findArray(int[] pref) {
        int prev = pref[0];
        int lent = pref.length;

        for(int i=1; i<lent; i++){
            int curr = pref[i];
            pref[i] = prev ^ curr;
            prev = curr;
        }

        return pref;
    }
}