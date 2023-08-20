class Solution {
    public int findDuplicate(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr)
        {
            if(hs.contains(i))
            {
                return i;
            }
            hs.add(i);
        }
        return -1;
    }
}