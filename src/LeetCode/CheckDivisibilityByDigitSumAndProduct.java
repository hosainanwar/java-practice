package LeetCode;

public class CheckDivisibilityByDigitSumAndProduct {
  private static int sumOfDigits(int num) {
    int sum = 0;
    while (num > 0) {
      int digit = num % 10;
      num /= 10;
    }
    return 0;
  }

  private static boolean checkDivisibility(int num) {
    return false;
  }
  public static void main(String[] args) {
    int num = 12;
    boolean result = checkDivisibility(num);
    System.out.println("Is " + num + " divisible by the sum and product of its digits? " + result);
  }
}
