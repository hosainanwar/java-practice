package LeetCode;

public class MultiplyString {
  public static String multiply(String num1, String num2) {
    if (num1.equals("0") || num2.equals("0")) { return "0"; }
    if (num1.equals("1")) { return num2; }
    if (num2.equals("1")) { return num1; }

    if (num1.length() < num2.length()) {
      String temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num2.length() == 1) {
      return multiplyByDigits(num1, num2.charAt(0));
    }
    int mid = num2.length() / 2;
    String high = num2.substring(0, mid);
    String low = num2.substring(mid);

    String productHigh = multiply(num1, high);
    String productLow = multiply(num1, low);

    productHigh = appendZeros(productHigh, low.length());
    return addStrings(productHigh, productLow);
  }

  public static String multiplyByDigits(String num, char digit) {
    if (digit == '0') { return num; }
    if (digit == '1') return num;
    StringBuilder res = new StringBuilder();
    int carry = 0;
    int digitIndex = digit -'0';

    for(int i = num.length()-1; i >= 0; i--) {
      int n = num.charAt(i) - '0';
      int product = carry + n * digitIndex;
      res.append(product % 10);
      carry = product / 10;
    }
    if (carry > 0) {
      res.append(carry);
    }
    return res.reverse().toString();
  }

  private static String addStrings(String num1, String num2) {
    StringBuilder res = new StringBuilder();
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    int carry = 0;
    while (i >= 0 || j >= 0 || carry > 0) {
      int n1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
      int n2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
      int sum = n1 + n2 + carry;
      res.append(sum % 10);
      carry = sum / 10;
    }
    return res.reverse().toString();
  }

  private static String appendZeros(String num, int zeros) {
    if (num.equals("0")) { return num; }
    return num + "0".repeat(zeros);
  }

  public static void main(String[] args) {
    String s = "123";
    String t = "456";
    System.out.println(multiply(s,t));
  }
}
