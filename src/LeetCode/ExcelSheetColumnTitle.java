package LeetCode;

public class ExcelSheetColumnTitle {
  public static void main(String[] args) {
    int columnNumber = 29;
    StringBuffer sb = new StringBuffer();
    while (columnNumber > 0) {
      columnNumber--;
      int num = 65 + columnNumber % 26;
      columnNumber /= 26;
      sb.append((char)num);
    }
    System.out.println(sb.reverse());
  }
}
