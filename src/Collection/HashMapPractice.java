package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {
  public static void main(String[] args) {
    System.out.println("HashMap Practice");
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "A");
    map.put(2, "B");
    map.put(3, null);
    map.put(null, null);
    map.put(null, "0");

    map.putIfAbsent(null, "test");
    map.putIfAbsent(3, "C");

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      Integer key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + "=" + value);
    }
    System.out.println("HashMap empty ? " + (map.isEmpty() ? "Yes" : "No"));
    System.out.println("get = " + map.get(1));
    System.out.println("get or default = " + map.getOrDefault(100, "Not Present"));
    Set<Integer> set = map.keySet();
    System.out.println("keySet = " + set);
    Collection<String> values = map.values();
    System.out.println("values = " + values);
  }
}
