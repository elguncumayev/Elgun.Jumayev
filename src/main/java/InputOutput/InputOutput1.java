package InputOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InputOutput1 {
  private static List<String> read(String filename) throws FileNotFoundException {
    File file = new File(filename);
    BufferedReader br = new BufferedReader(new FileReader(file));
    List<String> fileData = br.lines().collect(Collectors.toList());
    return fileData;
  }

  private static void write(List<String> data, String filename) throws IOException {
    File file = new File(filename);
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    for (String line : data) {
      bw.write(line);
      bw.write("\n");
    }
    bw.close();
  }

  private static List<Integer> generate(int size, int rangeLeft, int rangeRight) {
    ArrayList<Integer> rand = new ArrayList<>();
    for (int j = 0; j < size; j++) {
      rand.add((int) (Math.random() * (rangeRight - rangeLeft + 1)) + rangeLeft);
    }
    return rand;
  }

  private static List<Integer> sort(List<Integer> unsorted) {
    List<Integer> sorted = unsorted.stream().sorted().collect(Collectors.toList());
    return sorted;
  }
  private static List<Integer> convertIS(List<String> strArray) {
    List<Integer> intArray = strArray.stream().map(Integer::valueOf).collect(Collectors.toList());
    return intArray;
  }

  private static List<String> convertSI(List<Integer> intArray) {
    List<String> strArray = intArray.stream().map(String::valueOf).collect(Collectors.toList());
    return strArray;
  }
  public static void main(String[] args) throws IOException {
    List<Integer> randoms = generate(100, -30, 30);
    List<String> randoms2 = convertSI(randoms);
    write(randoms2, "file1.txt");
    List<String> contents = read("file1.txt");
    List<Integer> randoms3 = convertIS(contents);
    List<Integer> sorted_randoms = sort(randoms3);
    List<String> sorted_randomss = convertSI(sorted_randoms);
    write(sorted_randomss, "file2.txt");
  }
}