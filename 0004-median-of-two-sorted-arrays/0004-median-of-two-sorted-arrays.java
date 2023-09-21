class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int nums[]=new int[n];
        int j=0;
        
        for(int i=0;i<nums1.length&&j<n;i++){
          nums[j]=nums1[i];
          j++;
        }
        for(int i=0;i<nums2.length&&j<n;i++){
          nums[j]=nums2[i];
          j++;
        }
         Arrays.sort(nums);
         
         if (n%2==0) {
         return (float)(nums[n/2-1] + nums[n/2])/2;
         }
        else{
         return nums[n/2];
        }
    }
}