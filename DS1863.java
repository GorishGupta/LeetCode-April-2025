public class DS1863 {
    public static class Solution {
        public int subsetXORSum(int[] nums) {
            int total = 0;
            for (int num : nums) {
                total |= num; // Step 1: Compute bitwise OR of all numbers
            }
            return total * (1 << (nums.length - 1)); // Step 2: Multiply by 2^(n-1)
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3 };
        System.out.println(solution.subsetXORSum(nums)); // Output: 6
    }
}