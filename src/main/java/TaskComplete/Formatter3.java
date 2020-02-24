package TaskComplete;

public class Formatter3 implements Formatter{
  @Override
  public String change(String str) {
    str = str.toUpperCase();
    StringBuilder stringBuilder = new StringBuilder();
    String temp;
    for (int i = 0; i < str.length() + 4; i++) {
      stringBuilder.append("*");
    }
    temp = stringBuilder.toString();
    stringBuilder.append(String.format("\n* %s *\n%s",str,temp));
    return stringBuilder.toString();
  }
}
