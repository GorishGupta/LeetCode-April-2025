import java.util.Arrays;
import java.util.Scanner;

public static int minOperations(int[] nums, int k) {
    Arrays.sort(nums);
    int mini = nums[0];
    if (mini < k)
        return -1;

    int cnt = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > k) {
            cnt++;
            while (i + 1 < nums.length && nums[i] == nums[i + 1])
                i++;
        }
    }
    return cnt;
}

public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    int k = 3;
    System.out.println(minOperations(nums, k)); // Output: 2
}
