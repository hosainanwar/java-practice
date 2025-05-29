package LeetCode;

import java.util.ArrayList;
import java.util.List;
// not done
public class SumCombination {
  public List<List<Integer>> combination(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < candidates.length; i++) {
      List<Integer> list = new ArrayList<>();
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println("Sum Combination :");
    int[] candidates = {1, 2, 3, 4, 5};
    int target = 6;
    new SumCombination().combination(candidates, target);
  }
}
