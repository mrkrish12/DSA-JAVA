class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls = new ArrayList<>();
        long fac=1;
        ls.add(1);
        int r = rowIndex;
        for(int i=1;i<=rowIndex;i++)
        {
            fac = fac*(r--);
            fac= fac/i;
            ls.add((int)fac);
        }
        return ls;
    }
}