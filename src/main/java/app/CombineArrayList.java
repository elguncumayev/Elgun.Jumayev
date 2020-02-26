package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CombineArrayList {
  public ArrayList<Integer> combine(List<Integer> first , List<Integer> second){
    HashSet<Integer> set = new HashSet<>();
    set.addAll(first);
    set.addAll(second);
    return new ArrayList<>(set);
  }
//  public ArrayList<Integer> randomNums(int size){
//    ArrayList<Integer> rand = new ArrayList<>();
//    for (int i = 0; i < size; i++) {
//      rand.add((int) (Math.random() * (200 + 1) - 100));
//    }
//    return rand;
//  }
}
