import java.util.Arrays;

public class DS2140 {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            int points = questions[i][0];
            int brainpower = questions[i][1];
            int next = i + brainpower + 1;

            long take = points + (next < n ? dp[next] : 0);
            long skip = dp[i + 1];

            dp[i] = Math.max(take, skip);
        }

        return dp[0];
    }

    public static void main(String[] args) {
        DS2140 solution = new DS2140();
        int[][] questions = { { 3, 2 }, { 4, 3 }, { 4, 4 }, { 2, 5 } };
        System.out.println(solution.mostPoints(questions)); // Output: 7
    }
}
