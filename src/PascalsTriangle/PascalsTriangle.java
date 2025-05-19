package PascalsTriangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalsTriangle {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      list.add(pascalsTriangle(i));
    }
    return list;
  }
  public List<Integer> pascalsTriangle(int n) {
      List<Integer> list = new ArrayList<>();
      int res = 1;
      list.add(1);
      for (int i = 1; i <n; i++) {
        res = res * (n-i);
        res /= i;
        list.add(res);
      }
      return list;
  }


  public static void main(String[] args) {
    System.out.println(new PascalsTriangle().generate(5));
  }
}

//public List<List<Integer>> generate(int numRows) {
//  List<List<Integer>> result = new ArrayList<>();
//  if (numRows == 0) return result;
//  List<Integer> row = new ArrayList<>();
//  row.add(1);
//  result.add(row);
//
//  for (int i = 1; i < numRows; i++) {
//    List<Integer> prevRow = result.get(i - 1);
//    List<Integer> currRow = new ArrayList<>();
//    currRow.add(1);
//    for (int j = 1; j < i; j++) {
//      currRow.add(prevRow.get(j - 1) + prevRow.get(j));
//    }
//    currRow.add(1);
//    result.add(currRow);
//  }
//  return result;
//}


//public List<List<Integer>> generate(int numRows) {
//  int[][] a = new int[numRows][numRows];
//  for (int i=0; i<numRows; i++) {
//    for (int j=0; j<i+1; j++) {
//      if (i==0 || i==1) {
//        a[i][j] = 1;
//      } else {
//        if (j==0 || j==i) {
//          a[i][j] = 1;
//        } else {
//          a[i][j] = a[i-1][j-1] + a[i-1][j];
//        }
//      }
//    }
//  }
//  List<List<Integer>> list2D = Arrays.stream(a)
//    .map(row -> Arrays.stream(row)
//      .filter(num -> num != 0)
//      .boxed()
//      .collect(Collectors.toList())
//    )
//    .collect(Collectors.toList());
//  return list2D;
//}