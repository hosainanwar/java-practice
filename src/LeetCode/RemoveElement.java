package LeetCode;

public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index++] = nums[i];
      }
    }
    return index;
  }

  public static void main(String[] args) {
    int[] nums = {0,1,2,2,3,0,4,2};
    int target = 2;
    RemoveElement removeElement = new RemoveElement();
    System.out.println(removeElement.removeElement(nums, target));
  }
}