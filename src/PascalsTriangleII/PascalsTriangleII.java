package PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

  public List<Integer> getRow(int rowIndex) {
    List<Integer> list = new ArrayList<>();
    long res = 1;
    for (int i = 0; i <= rowIndex; i++) {
      list.add((int) res);
      res = res * (rowIndex-i) / (i + 1);
    }
    return list;
  }


  public static void main(String[] args) {
    System.out.println(new PascalsTriangleII().getRow(30));
  }
}