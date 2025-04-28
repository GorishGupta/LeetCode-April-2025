public class DS2302 {

    public long countSubarrays(int[] nums, long k) {
        long sum = 0l, cnt = 0l;
        int i = 0, j = 0;
        while (j < nums.length) {
            sum += nums[j];

            while (sum * (j - i + 1) >= k) {
                sum -= nums[i];
                i++;
            }
            cnt += j - i + 1;
            System.out.println(cnt);
            j++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        DS2302 ds = new DS2302();
        int[] nums = { 1, 2, 3, 4 };
        long k = 10;
        System.out.println(ds.countSubarrays(nums, k)); // Output: 7
    }
}
