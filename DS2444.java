public class DS2444 {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int left = -1, min = -1, max = -1, n = nums.length;
        long count = 0l;
        for (int i = 0; i < n; i++)
            if (nums[i] < minK || nums[i] > maxK)
                left = min = max = i;
            else {
                min = nums[i] == minK ? i : min;
                max = nums[i] == maxK ? i : max;
                count += (min < max ? min : max) - left;
            }
        return count;
    }

    public static void main(String[] args) {
        DS2444 newDs2444 = new DS2444();
        int[] nums = { 1, 3, 5, 2, 7, 5 };
        int minK = 1;
        int maxK = 5;
        System.out.println(newDs2444.countSubarrays(nums, minK, maxK)); // Output: 14
    }
}
