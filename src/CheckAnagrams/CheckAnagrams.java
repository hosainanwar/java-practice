package CheckAnagrams;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
  public static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }
    Map<Character, Integer> map = new HashMap<>();

    // for first string
    for (char c : a.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    // for second string
    for (char c : b.toCharArray()) {
      if (!map.containsKey(c)) return false;
      map.put(c, map.getOrDefault(c, 0) - 1);
      if (map.get(c) < 0) return false;
    }
    for (int count : map.values()) {
      if (count != 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
//    System.out.println("Check anagrams in Java");
    String fristString = "Madam";
    String secondString = "daaMm";
    if (isAnagram(fristString, secondString)) {
      System.out.println("Anagram found");
    } else {
      System.out.println("Not Anagram found");
    }
  }
}
