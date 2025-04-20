public class DS781 {
    class Solution {
        public int numRabbits(int[] answers) {
            int ans = 0;
            int[] count = new int[1000];

            for (final int answer : answers) {
                if (count[answer] % (answer + 1) == 0)
                    ans += answer + 1;
                ++count[answer];
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        DS781 ds781 = new DS781();
        Solution solution = ds781.new Solution();
        int[] answers = { 1, 1, 2 };
        System.out.println(solution.numRabbits(answers)); // Output: 5
    }
}
