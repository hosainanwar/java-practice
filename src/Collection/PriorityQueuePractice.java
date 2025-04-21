package Collection;

import java.util.ArrayDeque;
import java.util.Arrays;

public class PriorityQueuePractice {
  public static void main(String[] args) {
    Integer[] arr = {5,987,3,1,8,7,55,3,1,4,654};
    Arrays.sort(arr, (Integer v1, Integer v2) -> v2.compareTo(v1));
    System.out.println(Arrays.toString(arr));

    ArrayDeque<Integer> queue = new ArrayDeque<>();
    queue.add(1);
    queue.addFirst(3);

    System.out.println(Arrays.toString(queue.toArray()));
  }
}
