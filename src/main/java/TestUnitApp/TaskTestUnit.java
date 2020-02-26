package TestUnitApp;

public class TaskTestUnit implements Filterable {
  final String LOWVOW = "aioue";

  @Override
  public String filter(String origin) {
    if (origin == null) {
      return null;
    }

    origin = origin.toLowerCase();

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      char c = origin.charAt(i);
      if (!LOWVOW.contains(String.valueOf(c))) {
        result.append(c);
      }
    }
    return result.toString();
  }
}
