class Solution {
    public int minDeletions(String s) {
        int delection =0;
        
        int freq[] = new int[26];
        
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        
        Set<Integer> ls =new HashSet<>();
        
        for(int count : freq)
        {
            while(count>0 && ls.contains(count))
            {
                delection++;
                count--;
            }
            ls.add(count);
        }
        return delection;
    }
}