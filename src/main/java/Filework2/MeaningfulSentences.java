package Filework2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class MeaningfulSentences {
  public static void main(String[] args) throws IOException {
    List<String> subj_verb_row = read("subj_verb.txt");
    Map<String, List<String>> subj_verb_converted = convert(subj_verb_row);
    List<String> verb_obj_row = read("verb_obj.txt");
    Map<String, List<String>> verb_obj_converted = convert(verb_obj_row);
    List<String> sentences = combine(subj_verb_converted, verb_obj_converted);
    write(sentences, "meaningfulSentences.txt");
  }

  private static List<String> read(String filename) throws IOException {
    File file = new File(filename);
    BufferedReader br = new BufferedReader(new FileReader(file));
    return br.lines().collect(Collectors.toList());
  }

  private static Map<String, List<String>> convert(List<String> rowData) {
    Map<String, List<String>> hashMap = new HashMap<>();
    for (String rowDatum : rowData) {
      String[] split = rowDatum.split(":");
      String[] split2nd = split[1].split(",");

      hashMap.put(
              split[0].trim(),
              Arrays.stream(split2nd).map(String::trim).collect(Collectors.toList()));
    }
    return hashMap;
  }

  private static List<String> combine(Map<String, List<String>> subj_verb, Map<String, List<String>> verb_obj) {
    List<String> sentences = subj_verb.keySet().stream().flatMap(subj ->
            subj_verb.get(subj).stream().flatMap(verb ->
                    verb_obj.get(verb).stream().map(obj -> String.format("%s %s %s.", subj, verb, obj))))
            .collect(Collectors.toList());
    return sentences;
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

}