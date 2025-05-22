package LinkedListPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestElementSearching {
  public static Integer secondHighestElement(List<Integer> list) {
    return list.stream()
      .distinct()
      .sorted((a,b)->b-a)
      .skip(1)
      .findFirst()
      .get();
  }
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,1,2,4,5,6,9,9,9);
    System.out.println(secondHighestElement(list));
  }
}
