package LeetCode;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {

  public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    int left = 0, right = numbers.length-1;
    while (left < right) {
      int sum = numbers[left] + numbers[right];
      if (sum == target) {
        result[0] = left+1;
        result[1] = right+1;
        break;
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;
    TwoSumIIInputArrayIsSorted solution = new TwoSumIIInputArrayIsSorted();
    System.out.println(Arrays.toString(solution.twoSum(nums, target)));
  }
}
