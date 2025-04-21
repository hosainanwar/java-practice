package SingleTone;

public class DoubleCheckLock {
  public static DoubleCheckLock doubleCheckLock;
  private DoubleCheckLock() {}
  public static DoubleCheckLock getDoubleCheckLock() {
    if (doubleCheckLock == null) {
      synchronized (DoubleCheckLock.class) {
        if (doubleCheckLock == null) {
          System.out.println("DoubleCheckLock is running.");
          doubleCheckLock = new DoubleCheckLock();
        }
      }
    }
    return doubleCheckLock;
  }
}
