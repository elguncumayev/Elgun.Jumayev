package Filework2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class MeaningfulSentences {
  private static Map<String, List<String>> read(String filename) throws IOException {
    File file = new File(filename);
    BufferedReader br = new BufferedReader(new FileReader(file));
    List<String> rowData = br.lines().collect(Collectors.toList());
    Map<String, List<String>> hashMap = new HashMap<>();
    for (String rowDatum : rowData) {
      String[] split = rowDatum.split(":");
      String[] split2nd = split[1].split(",");
      for (int i = 0; i < split2nd.length; i++) {
        split2nd[i] = split2nd[i].trim();
      }
      hashMap.put(split[0], Arrays.asList(split2nd));
    }
    br.close();
    return hashMap;
  }
  private static List<String> createSen_s(Map<String, List<String>> subj_verb, Map<String, List<String>> verb_obj) {
    ArrayList<String> result = new ArrayList<>();
    for (String subj : subj_verb.keySet()) {
      for (String verb : subj_verb.get(subj)){
        for (String obj : verb_obj.get(verb)){
          result.add(String.format("%s %s %s.",subj,verb,obj));
        }
      }
    }
    return result;
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
  public static void main(String[] args) throws IOException {
    Map<String,List<String>> subj_verb = read("subj_verb.txt");
    Map<String,List<String>> verb_obj = read("verb_obj.txt");
    List<String> sentences = createSen_s(subj_verb,verb_obj);
    write(sentences,"meaningfulSentences.txt");
  }
}
