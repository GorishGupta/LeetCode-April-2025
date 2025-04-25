public class DS2845 {
    class Solution {
        public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {

            int n = nums.size();
            if (k > n)
                return 0;

            int[] count = new int[n + 1];
            count[0] = 1;

            long ans = 0;
            int sum = 0;
            for (int x : nums) {
                x %= modulo;
                if (x == k)
                    ++sum;

                sum %= modulo;
                int r = sum - k;
                if (r < 0)
                    r += modulo;
                if (r < n)
                    ans += count[r];

                count[sum]++;
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        DS2845 newDs2845 = new DS2845();
        Solution solution = newDs2845.new Solution();
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        int modulo = 3;
        int k = 1;
        System.out.println(solution.countInterestingSubarrays(nums, modulo, k)); // Output: 10
    }
}
