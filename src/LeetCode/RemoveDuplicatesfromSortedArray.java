package LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
  public static void main(String[] args) {
    int[] nums = {1, 1, 2};
    int j=1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i-1]) {
        nums[j] = nums[i];
        j++;
      }
      Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
      System.out.println(" ");
    }
  }
}
