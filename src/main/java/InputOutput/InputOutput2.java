package InputOutput;

import javafx.util.Pair;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InputOutput2 {
  private static List<String> read(String filename) throws FileNotFoundException {
    File file = new File(filename);
    BufferedReader br = new BufferedReader(new FileReader(file));
    List<String> fileData = br.lines().collect(Collectors.toList());
    return fileData;
  }

  private static void write(List<Pair<String,String>> data, String filename) throws IOException {
    File file = new File(filename);
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    for (Pair line : data) {
      bw.write(line.getKey().toString() + ":" + line.getValue().toString());
      bw.write("\n");
    }
    bw.close();
  }

  private static List<Pair<Integer, Integer>> generate(int size, int rangeLeft, int rangeRight) {
    List<Pair<Integer, Integer>> rand = new ArrayList<>();
    for (int j = 0; j < size; j++) {
      rand.add(new Pair((int) (Math.random() * (rangeRight - rangeLeft + 1)) + rangeLeft,
                        (int) (Math.random() * (rangeRight - rangeLeft + 1)) + rangeLeft));
      //rand.add((int) (Math.random() * (rangeRight - rangeLeft + 1)) + rangeLeft);
    }
    return rand;
  }

  private static List<Integer> sort(List<Integer> unsorted) {
    List<Integer> sorted = unsorted.stream().sorted().collect(Collectors.toList());
    return sorted;
  }
  private static List<Pair<Integer,Integer>> convertIS(List<Pair<String,String>> strArray) {
    List<Pair<Integer, Integer>> intArray = strArray.stream()
            .map(pair -> new Pair<>(Integer.parseInt(pair.getKey()), Integer.parseInt(pair.getValue())))
            .collect(Collectors.toList());
    return intArray;
  }

//  private static List<Pair<String,String>> convertSI(List<Pair<Integer,Integer>>  intArray) {
//    List<String> strArray = intArray.stream().map(String::valueOf).collect(Collectors.toList());
//    return strArray;
//  }
  public static void main(String[] args) throws IOException {
//    List<Pair<Integer,Integer>> randoms = generate(100, -30, 30);
//    List<Pair<String, String>> randoms2 = convertSI(randoms);
//    write(randoms2, "file1.txt");
//    List<String> contents = read("file1.txt");
//    List<Pair<Integer,Integer>> randoms3 = convertIS(contents);
//    List<Integer> sorted_randoms = sort(randoms3);
//    List<String> sorted_randomss = convertSI(sorted_randoms);
//    write(sorted_randoms, "file2.txt");
  }
}
