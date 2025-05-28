import java.util.Arrays;

public class PlusOne {

  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i]+1 != 10) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }
    int[] newArray = new int[digits.length + 1];
    newArray[0] = 1;
    return newArray;
  }

  public static void main(String[] args) {
    int[] digits = {1,2,3,4,9};
    PlusOne plusOne = new PlusOne();
    System.out.println(Arrays.toString(plusOne.plusOne(digits)));
  }
}
