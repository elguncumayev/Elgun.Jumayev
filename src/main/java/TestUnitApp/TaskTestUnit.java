package TestUnitApp;

public class TaskTestUnit implements Filterable {
  final String LOWVOW = "aioue";
  final String UPPVOW = "AIOUE";

  @Override
  public String filter(String origin) {
    if (origin == null) {
      return null;
    }
    origin = origin.trim();

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      char c = origin.charAt(i);
      if (!(LOWVOW.contains(String.valueOf(c)) || UPPVOW.contains(String.valueOf(c)))) {
        if (!(c == ' ' && result.charAt(result.length()-1) == ' ')) result.append(c);
      }
    }
    return result.toString();
  }
}
