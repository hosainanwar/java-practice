package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
  }

  public static void main(String[] args) {
    System.out.println("Majority Element");
    int[] nums = {2,2,1,1,1,2,2};
    MajorityElement majorityElement = new MajorityElement();
    System.out.println(majorityElement.majorityElement(nums));
  }
}
