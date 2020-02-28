package NumOfLetters;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumOfLetters {

  public static void main(String[] args) {
    String origin = "Hello World";
    HashMap<Character, List<Integer>> map = new HashMap<>();

    IntStream.range(0, origin.length()).forEach(i -> {
      char c = origin.charAt(i);
      List<Integer> positions = map.getOrDefault(c, new ArrayList<>());
      positions.add(i);
      map.put(c, positions);
    });
    ArrayList<Character> characters = new ArrayList<>(map.keySet());
    Collections.sort(characters);
    int i = 0;
    for(char character : characters){
      System.out.printf("Letter: %s, positions -> %d : %s\n", characters.get(i),map.keySet().size(),map.get(characters.get(i)));
      i++;
    }
  }

}
