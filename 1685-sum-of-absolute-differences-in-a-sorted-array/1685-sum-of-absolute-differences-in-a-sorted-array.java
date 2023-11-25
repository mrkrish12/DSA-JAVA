class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int N = nums.length;
        int[] res = new int[N];

        int sum = 0;
        for(int i = 1; i < N; i++) {
            sum += nums[i];
        }

        res[0] = sum - nums[0] * (N - 1);

        for(int i = 1; i < N; i++) {
            int diff = nums[i] - nums[i - 1];
            int cntLeft = i - 1, cntRight = N - 1 - i;
            res[i] = res[i - 1] + cntLeft * diff - cntRight * diff;

        }

        return res;
    }
}