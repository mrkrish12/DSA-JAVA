class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] words = s.split(" ");
        
        if(words.length!=pattern.length())
        {
            return false;
        }
     
         
        for(int i=0;i<pattern.length();i++)
        {
            char cur = pattern.charAt(i);
            if(map.containsKey(cur))
            {
                if(!map.get(cur).equals(words[i]))
                {
                    return false;
                }
            }
            else{
                if(map.containsValue(words[i]))
                {
                    return false;
                }
                map.put(cur,words[i]);
            }
        }
        return true;
    }
}