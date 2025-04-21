package SingleTone;

public class BillPughSolution {
  private BillPughSolution() {}

  private static class BillPughSolutionHelper {
    private static final BillPughSolution INSTANCE = new BillPughSolution();
  }

  public static BillPughSolution getInstance() {
    System.out.println("BillPughSolution is running");
    return BillPughSolutionHelper.INSTANCE;
  }
}
