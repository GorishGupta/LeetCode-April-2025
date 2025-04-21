public class DS2145 {
    class Solution {
        public int numberOfArrays(int[] differences, int lower, int upper) {
            long sum = 0;
            long mini = 0, maxi = 0;

            for (int diff : differences) {
                sum += diff;
                mini = Math.min(mini, sum);
                maxi = Math.max(maxi, sum);
            }

            long validLow = lower - mini;
            long validHigh = upper - maxi;

            return (int) Math.max(0, validHigh - validLow + 1);
        }
    }

    public static void main(String[] args) {
        DS2145 ds2145 = new DS2145();
        Solution solution = ds2145.new Solution();
        int[] differences = { 1, -3, 4 };
        int lower = 1;
        int upper = 6;
        System.out.println(solution.numberOfArrays(differences, lower, upper)); // Output: 2

    }
}
