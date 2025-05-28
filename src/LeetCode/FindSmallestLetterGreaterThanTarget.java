package LeetCode;

public class FindSmallestLetterGreaterThanTarget {
  public char nextGreatestLetter(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (letters[mid] > target) { end = mid - 1; }
      else if (letters[mid] <= target) { start = mid + 1; }
    }
    return letters[start % letters.length];
  }
  public static void main(String[] args) {
    char[] letters = {'c', 'f', 'h', 'j', 'l', 'm'};
    char target = 'j';
    FindSmallestLetterGreaterThanTarget solution = new FindSmallestLetterGreaterThanTarget();
    System.out.println(solution.nextGreatestLetter(letters, target));
  }
}
