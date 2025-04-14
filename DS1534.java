public class DS1534 {
    class Solution {
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
            int ct = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[i] - arr[j]) <= a &&
                                Math.abs(arr[j] - arr[k]) <= b &&
                                Math.abs(arr[i] - arr[k]) <= c) {
                            ct++;
                        }
                    }
                }
            }
            return ct;
        }
    }

    public static void main(String[] args) {
        Solution sol = new DS1534().new Solution();
        int[] arr = { 1, 2, 3, 4, 5 };
        int a = 1, b = 1, c = 1;
        System.out.println(sol.countGoodTriplets(arr, a, b, c)); // Output: 10
    }
}
