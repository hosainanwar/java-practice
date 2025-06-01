package LeetCode;

public class LengthofLastWord {
  public int lengthOfLastWord(String s) {
    if (s == null || s.length() == 0) return 0;
    if (s.length() == 1) return 1;
    String newStr = s.trim();
    int len = 0;
    for (int i = newStr.length() - 1; i >= 0; i--) {
      if (newStr.charAt(i) != ' ') {len++;}
      if (newStr.charAt(i) == ' ') break;
    }
    return len;
  }

  public static void main(String[] args) {
    String s = "luffy is still joyboy";
    LengthofLastWord l = new LengthofLastWord();
    System.out.println(l.lengthOfLastWord(s));
  }
}
