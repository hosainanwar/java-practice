package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LongestValidParentheses {
  public int longestValidParentheses(String s) {
    if (s == null || s.length() == 0) return 0;
    int res = 0;
    Stack<Character> stack = new Stack<>();
    Map<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.containsValue(c)) {
        stack.push(c);
      } else if (map.containsKey(c)) {
        if (stack.pop() == map.get(c)) {
          res++;
        }
      }
    }
    return res*2;
  }
  public static void main(String[] args) {
    String s = ")()())";
    LongestValidParentheses l = new LongestValidParentheses();
    System.out.println(l.longestValidParentheses(s));
  }
}
