public class DS3392 {
    class Solution {
        public int countSubarrays(int[] nums) {
            int count = 0;
            for (int i = 0; i + 2 < nums.length; i++) {
                if (2 * (nums[i] + nums[i + 2]) == nums[i + 1]) {
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        DS3392 newDs3392 = new DS3392();
        Solution solution = newDs3392.new Solution();
        int[] nums = { 1, 3, 5, 2, 7, 5 };
        System.out.println(solution.countSubarrays(nums)); // Output: 14
    }
}
