package LeetCode;

public class BinarySearch {
  public int binarySearch(int[] nums, int target) {
    int start = 0, end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) { return mid; }
      if (nums[mid] < target) { start = mid + 1; }
      if (nums[mid] > target) { end = mid - 1; }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] nums = {-1,2,3,4,5,6,7,8,9};
    int target = 7;
    System.out.println(new BinarySearch().binarySearch(nums, target));
  }
}
