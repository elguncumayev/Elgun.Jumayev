package ComperatorTask;

import java.util.*;
import java.util.stream.Collector;

public class ComperatorTask {
  public static void main(String[] args) {
    int[] randNums = new int[50];
    for (int i = 0; i < 50; i++) {
      randNums[i] = (int) (Math.random() * (100 + 1));
    }
  }
}
