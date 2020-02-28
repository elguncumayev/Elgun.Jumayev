package NumOfLetters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class NumOfLettersTask5 {
  public static void main(String[] args) {
    String origin = "Hello World";
    HashMap<Character, List<Integer>> map = new HashMap<>();
    ArrayList<Character> charOrder = new ArrayList<>();
    IntStream.range(0, origin.length()).forEach(i -> {
      char c = origin.charAt(i);
      if(!charOrder.contains(c)){
        charOrder.add(c);
      }
      List<Integer> positions = map.getOrDefault(c, new ArrayList<>());
      positions.add(i+1);
      map.put(c, positions);
    });
    for (char c : charOrder) {
      System.out.printf("Letter: %s, positions -> %d : %s\n", c, map.get(c).size(), map.get(c));
    }
  }
}
