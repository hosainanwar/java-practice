package SingleTone;

public class LazyInitialization {
  public static LazyInitialization lazyInitialization;
  private LazyInitialization() {}
  public static LazyInitialization getInstance() {
    if (lazyInitialization == null) {
      System.out.println("Lazy Initialization Success");
      lazyInitialization = new LazyInitialization();
    }
    return lazyInitialization;
  }
}
