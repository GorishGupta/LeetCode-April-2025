public class DS2879 {
    public class Solution {
        public long maximumTripletValue(int[] nums) {
            long maxTriplet = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int k = nums.length - 1; k > i; k--) {
                    int j = i + 1;
                    while (j < k) {
                        maxTriplet = Math.max(maxTriplet, (long) (nums[i] - nums[j]) * nums[k]);
                        j++;
                    }
                }
            }
            return Math.max(0, maxTriplet);
        }
    }
    public static void main(String[] args) {
        DS2879 ds2879 = new DS2879();
        Solution solution = ds2879.new Solution();
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(solution.maximumTripletValue(nums)); // Output: 6
    }
}