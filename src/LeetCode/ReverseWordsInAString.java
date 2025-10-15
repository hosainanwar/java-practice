package LeetCode;

public class ReverseWordsInAString {
  public String reverseWords(String s) {
    String[] words = s.split("\\s+");
    String res = "";
    for (int i=words.length-1; i>=0; i--) {
      res += words[i] + " ";
    }
    return res.trim();
  }

  public static void main(String[] args) {
    ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
    System.out.println(reverseWordsInAString.reverseWords("a good   example"));
  }
}
