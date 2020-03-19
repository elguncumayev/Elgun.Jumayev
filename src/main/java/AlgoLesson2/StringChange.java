package AlgoLesson2;

public class StringChange {
  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
  String invertCase(String origin) {
    char c;
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      c = origin.charAt(i);
      if(c<=90 && c>=65){
        c+=32;
      }
      else c-=32;
      str.append(c);
    }
    return str.toString();
  }

  // abc -> ABC
  // aBc -> ABC
  // Abc -> ABC
  String toUpperCase(String origin) { // a -> A A -> A
    char c;
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      c = origin.charAt(i);
      if(c<=122 && c>=97){
        c-=32;
      }
      str.append(c);
    }
    return str.toString();
  }

  // abc -> abc
  // aBc -> abc
  // Abc -> abc
  String toLowerCase(String origin) { // A -> a a -> a
    char c;
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      c = origin.charAt(i);
      if(c<=90 && c>=65){
        c+=32;
      }
      str.append(c);
    }
    return str.toString();
  }

}
