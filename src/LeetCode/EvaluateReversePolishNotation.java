package LeetCode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    Integer secondElement = 0;
    Integer firstElement = 0;
    for (String token : tokens) {
      switch (token) {
        case "+":
          secondElement = stack.pop();
          firstElement = stack.pop();
          stack.push( firstElement + secondElement);
          break;
        case "-":
          secondElement = stack.pop();
          firstElement = stack.pop();
          stack.push(firstElement - secondElement);
          break;
        case "*":
          secondElement = stack.pop();
          firstElement = stack.pop();
          stack.push( firstElement * secondElement);
          break;
        case "/":
          secondElement = stack.pop();
          firstElement = stack.pop();
          stack.push( firstElement / secondElement);
          break;
        default:
          stack.push(Integer.parseInt(token));
          break;
      }
    }
    return stack.pop();
  }

  public static void main(String[] args) {
    System.out.println("Evaluate Reverse Polish Notation");
    String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
    EvaluateReversePolishNotation eval = new EvaluateReversePolishNotation();
//    eval.evalRPN(tokens);
    System.out.println(eval.evalRPN(tokens));
  }
}
