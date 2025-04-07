public class DS416 {
    class Solution {
        public boolean canPartition(int[] nums) {
            int totalSum = 0;
            for (int num : nums)
                totalSum += num;
            if (totalSum % 2 != 0)
                return false;
            int targetSum = totalSum / 2;
            boolean[] dp = new boolean[targetSum + 1];
            dp[0] = true;
            for (int num : nums) {
                for (int currSum = targetSum; currSum >= num; currSum--) {
                    dp[currSum] = dp[currSum] || dp[currSum - num];
                    if (dp[targetSum])
                        return true;
                }
            }
            return dp[targetSum];
        }
    }

    public static void main(String[] args) {
        DS416 ds416 = new DS416();
        Solution solution = ds416.new Solution();
        int[] nums = { 1, 5, 11, 5 };
        boolean result = solution.canPartition(nums);
        System.out.println(result); // Output: true
        nums = new int[] { 1, 2, 3, 5 };
        result = solution.canPartition(nums);
        System.out.println(result); // Output: false
        nums = new int[] { 1, 2, 3, 4, 5, 6 };
        result = solution.canPartition(nums);
        System.out.println(result); // Output: true
        nums = new int[] { 1, 2, 3, 4, 5, 7 };
    }
}
