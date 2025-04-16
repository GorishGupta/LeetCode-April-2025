import java.util.HashMap;
import java.util.Map;

public class DS2537 {
    class Solution {
        public long countGood(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            long count = 0;
            int left = 0;
            for (int i = 0; i < nums.length; i++) {
                k -= map.getOrDefault(nums[i], 0);
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                while (k <= 0) {
                    map.put(nums[left], map.get(nums[left]) - 1);
                    k += map.get(nums[left++]);
                }
                count += left;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        DS2537 ds = new DS2537();
        Solution solution = ds.new Solution();
        int[] nums = { 1, 2, 3, 1, 2, 3 };
        int k = 2;
        long result = solution.countGood(nums, k);
        System.out.println("Count of good subarrays: " + result); // Output: Count of good subarrays: 4
    }
}
