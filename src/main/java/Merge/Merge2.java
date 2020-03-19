package Merge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Merge2 {

  public static void main(String[] args) {
    Comparator<Apple> ac = (o1, o2) -> o1.size - o2.size;
    List<Apple> data1 = new Random().ints(10, 30).limit(10)
            .mapToObj(n -> new Apple(n)).sorted(ac).collect(Collectors.toList());
    List<Apple> data2 = new Random().ints(10, 30).limit(10)
            .mapToObj(n -> new Apple(n)).sorted(ac).collect(Collectors.toList());
    List<Apple> data3 = merge(data1, data2);
    System.out.println(data1);
    System.out.println(data2);
    System.out.println(data3);
  }

  private static List<Apple> merge(List<Apple> data1, List<Apple> data2) {
    ArrayList<Apple> data3 = new ArrayList<>();
    int idx1 = 0;
    int idx2 = 0;

    while (idx1 < data1.size() && idx2 < data2.size()) {
      data3.add((data1.get(idx1).size < data2.get(idx2).size) ?data1.get(idx1++) : data2.get(idx2++));
    }
    while (idx1 < data1.size()) {
      data3.add(data1.get(idx1++));
    }
    while (idx2 < data2.size()) {
      data3.add(data2.get(idx2++));
    }

    return data3;
  }
}
