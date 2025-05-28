package LeetCode;

public class SquireSolution {
  public long binarySearch(int n) {
    long start = 0;
    long end = n;
    long mid = start + (end - start) / 2;
    long ans = -1;
    while (start <= end) {
      long squire = mid * mid;
      if (squire == n) {
        return mid;
      }
      if (squire<n) {
        ans = mid;
        start = mid + 1;
      }
      if (squire > n) {
        end = mid - 1;
      }
      mid = start + (end - start) / 2;
    }
    return ans;
  }
  public static void main(String[] args) {
    System.out.println("Binary Search Solution");
    SquireSolution solution = new SquireSolution();
    System.out.println(solution.binarySearch(9));
  }
}
