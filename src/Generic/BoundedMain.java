package Generic;

public class BoundedMain {
  public static void main(String[] args) {
    UpperBound<Short> upperBound = new UpperBound<>();
    upperBound.setValue((short) 1000);
    System.out.println("UpperBound value: " + upperBound.getValue());
  }
}
