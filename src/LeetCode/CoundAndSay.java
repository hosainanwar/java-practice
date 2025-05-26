package LeetCode;

public class CoundAndSay {
  public String coundAndSay(int n) {
    if (n <= 0) return "";
    String res = "1";
    for (int i = 1; i < n; i++) {
      res = buildNext(res);
    }
    return res;
  }
  private String buildNext(String res) {
    StringBuilder sb = new StringBuilder();
    int count = 1;
    char currentChar = res.charAt(0);

    for (int i = 1; i < res.length(); i++) {
      if (currentChar == res.charAt(i)) {
        count++;
      } else {
        sb.append(count).append(currentChar);
        currentChar = res.charAt(i);
        count = 1;
      }
    }
    sb.append(count).append(currentChar);
    return sb.toString();
  }

  public static void main(String[] args) {
    int n = 3;
    System.out.println(new CoundAndSay().coundAndSay(n));
  }
}
