class Solution {
    public int countpairs(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((i * j) % k == 0 && nums[i] == nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 3;
        System.out.println(sol.countpairs(nums, k)); // Output: 0
    }
}