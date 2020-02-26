package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CombineArrayList {
  public ArrayList<Integer> combine (List<Integer> first, List<Integer> second) {
    HashSet<Integer> set = new HashSet<>();
    set.addAll(first);
    set.addAll(second);
    return new ArrayList<>(set);
  }
}
