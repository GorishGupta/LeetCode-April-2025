import java.util.*;

public class DS3272 {
    class Solution {

        public long countGoodIntegers(int n, int k) {
            int start = (int) Math.pow(10, (n - 1) / 2);
            int end = start * 10;
            Set<String> unique = new HashSet<>();
            int count = 0;
            for (int i = start; i < end; i++) {
                String s = String.valueOf(i);
                String palindrome = new StringBuilder(s.substring(0, n / 2)).reverse().insert(0, s).toString();
                if (Long.valueOf(palindrome) % k == 0) {
                    String sorted = sortString(palindrome);
                    if (unique.contains(sorted))
                        continue;
                    unique.add(sorted);
                    count += countValidAnagrams(palindrome);
                }
            }
            return count;
        }

        private String sortString(String s) {
            char[] carr = s.toCharArray();
            Arrays.sort(carr);
            return String.valueOf(carr);
        }

        // Method to calculate valid permutations without leading zeros
        private long countValidAnagrams(String sortedNumber) {
            int n = sortedNumber.length();
            int[] freq = new int[10];

            // Calculate the frequency of each digit
            for (char c : sortedNumber.toCharArray()) {
                freq[c - '0']++;
            }

            // Calculate total permutations of the digits
            long totalPermutations = factorial(n);
            for (int f : freq) {
                if (f > 0) {
                    totalPermutations /= factorial(f);
                }
            }

            // Calculate permutations with leading zeros
            long leadingZeroPermutations = 0;
            if (freq[0] > 0) {
                leadingZeroPermutations = factorial(n - 1); // n-1 because first digit is fixed as 0
                freq[0]--;
                for (int f : freq) {
                    if (f > 0) {
                        leadingZeroPermutations /= factorial(f);
                    }
                }
            }

            // Valid permutations = total - those with leading zeros
            return totalPermutations - leadingZeroPermutations;
        }

        // Helper method to calculate factorial
        private long factorial(int num) {
            long result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        DS3272 ds = new DS3272();
        Solution solution = ds.new Solution();
        int n = 3;
        int k = 2;
        System.out.println(solution.countGoodIntegers(n, k)); // Output: 0
    }
}
