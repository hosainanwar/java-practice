package SingleTone;

public class EagerInitialization {
  public static EagerInitialization instance = new EagerInitialization();
  private EagerInitialization() {}
  public static EagerInitialization getInstance() {
    System.out.println("EagerInitialization Success");
    return instance;
  }
}
