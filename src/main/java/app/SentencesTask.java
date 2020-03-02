package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentencesTask {

  private static List<String> all_possible(List<String> subjects, List<String> verbs, List<String> objects) {
    List<String> sentences = new ArrayList<>();
    for (String subject : subjects) {
      for (String verb : verbs) {
        for (String object : objects) {
          sentences.add(subject + " " + verb + " " + object + ".");
        }
      }
    }
    return sentences;
  }

  public static void main(String[] args) {
    List<String> subjects = new ArrayList<>(Arrays.asList("Noel", "The cat", "The dog"));
    List<String> verbs =    new ArrayList<>(Arrays.asList("wrote", "chased", "slept on"));
    List<String> objects =  new ArrayList<>(Arrays.asList("the book","the ball","the bed"));

    List<String> sentences = all_possible(subjects, verbs, objects);
    for (String str :
            sentences) {
      System.out.println(str);
    }
  }
}
