class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a[] = new int[nums.length];
        int e=0;
        int o = nums.length-1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                a[e++] = nums[i];
            }
            else{
                a[o--] = nums[i];
            }
            
        }
        return a;
    }
}