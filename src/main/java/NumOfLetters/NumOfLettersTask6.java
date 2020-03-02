package NumOfLetters;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class NumOfLettersTask6 {
  public static void main(String[] args) {
    String origin = "Hello World";
    HashMap<Character, List<Integer>> map = new HashMap<>();

    IntStream.range(0, origin.length()).forEach(i -> {
      char c = origin.charAt(i);
      List<Integer> positions = map.getOrDefault(c, new ArrayList<>());
      positions.add(i);
      map.put(c, positions);
    });
    ArrayList<Pair> sizes = new ArrayList<>();
    for (char c : map.keySet()) {
      Pair pair = new Pair(c,map.get(c).size());
      sizes.add(pair);
    }
//    ArrayList<Character> characters = new ArrayList<>(map.keySet());
//    Collections.sort(characters);
//    int i = 0;
//    for(char character : characters){
//      System.out.printf("Letter: %s, positions -> %d : %s\n", characters.get(i),map.keySet().size(),map.get(characters.get(i)));
//      i++;
    }
  }

