public class DS1295 {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            int count = 0;
            while (i != 0) {
                i /= 10;
                count++;
            }
            if (count % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        DS1295 ds1295 = new DS1295();
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(ds1295.findNumbers(nums)); // Output: 2

    }
}
