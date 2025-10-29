package LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {

  public int threeSumClosetMethod(int[] nums, int target) {
    Arrays.sort(nums);
    int closetSum = Integer.MAX_VALUE / 2;
    for (int i = 0; i < nums.length - 2; ++i) {
      int left = i + 1, right = nums.length - 1;
      while (left < right) {
        int currentSum = nums[i] + nums[left] + nums[right];
        if (Math.abs(currentSum - target) < Math.abs(closetSum - target)) {
          closetSum = currentSum;
        }
        if (currentSum < target) {
          ++left;
        } else if (currentSum > target) {
          --right;
        } else {
          return currentSum;
        }
      }
    }
    return closetSum;
  }

  public static void main(String[] args) {
    int[] nums = {-1, 2, 1, -4};
    int target = 1;
    ThreeSumClosest a = new ThreeSumClosest();
    int result = a.threeSumClosetMethod(nums, target);
    System.out.println("Result: " + result);
  }
}
