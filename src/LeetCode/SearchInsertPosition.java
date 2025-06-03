package LeetCode;

public class SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    if (nums == null || nums.length == 0) return -1;
    int left = 0, right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[mid] > target) {
        right = mid - 1;
      }
      if (nums[mid] < target) {
        left = mid + 1;
      }
    }
    return left;
  }
  public static void main(String[] args) {
    int [] nums = {1,3,5,6};
    int target = 2;
    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
    System.out.println(searchInsertPosition.searchInsert(nums, target));
  }
}
