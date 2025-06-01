package LeetCode;

public class GreatestCommonDivisorOfStrings {
  public String gcdOfStrings(String str1, String str2) {
    if (!(str1+str2).equals(str2+str1)) return "";
    int gcd = getGcd(str1.length(), str2.length());
    return str1.substring(0, gcd);
  }

  public int getGcd(int n, int m) {
    if (m == 0) return n;
    return getGcd(m, n % m);
  }

  public static void main(String[] args) {
    System.out.println("Greatest Common Divisor of Strings");
    String str1 = "ab";
    String str2 = "abababababab";
    GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
    System.out.println(gcd.gcdOfStrings(str1, str2));
  }
}
