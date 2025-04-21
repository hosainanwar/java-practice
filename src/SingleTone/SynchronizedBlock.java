package SingleTone;

public class SynchronizedBlock {
  public static volatile SynchronizedBlock synchronizedBlock;
  private SynchronizedBlock() {}
  synchronized public static SynchronizedBlock getSynchronizedBlock() {
    if (synchronizedBlock == null) {
      System.out.println("SynchronizedBlock success");
      synchronizedBlock = new SynchronizedBlock();
    }
    return synchronizedBlock;
  }
}
