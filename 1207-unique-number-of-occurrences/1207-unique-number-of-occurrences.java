class Solution {
    public boolean uniqueOccurrences(int[] arr) {
   int[] c = new int[2001];
        //count occurance of each value
        for (int n : arr) {
            c[n+1000]++;   
        }
        //check unique occurances (except for 0)
        Set<Integer> set = new HashSet();
        for (int count : c) {
            if (count == 0)
                continue;
            if (!set.add(count))
                return false;
        }
        return true;
    }}