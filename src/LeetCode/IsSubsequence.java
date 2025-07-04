package LeetCode;

public class IsSubsequence {

  public boolean isSubsequence(String s, String t) {
    int i=0, j=0;
    while (i<s.length() && j<t.length()) {
      if (s.charAt(i) == t.charAt(j)) {
        i++;
      }
      j++;
    }
    return i == s.length();
  }
  public static void main(String[] args) {
    String s = "axc";
    String t = "ahbgdc";
    IsSubsequence isSubsequence = new IsSubsequence();
    System.out.println(isSubsequence.isSubsequence(s, t));
  }
}
