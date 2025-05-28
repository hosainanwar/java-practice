package LeetCode;

public class ExcelSheetColumnNumber {
  public static void main(String[] args) {
    String s = "AB";
    int total = 0;
    for (int i = 0; i < s.length(); i++) {
      total += (s.charAt(i) - 64) * Math.pow(26, s.length()-i-1);
    }
    System.out.println(total);
  }
}
