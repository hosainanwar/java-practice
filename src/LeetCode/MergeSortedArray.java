package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
  public int[] merge(int[] nums1, int m, int[] nums2, int n) {
    for (int i = m, j=0; i < m+n; i++, j++) {
      nums1[i] = nums2[j];
    }
    Arrays.sort(nums1);
    return nums1;
  }

  public static void main(String[] args) {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();
    int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = new int[]{2, 5, 6};
    int n = 3;
    mergeSortedArray.merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));
  }
}
